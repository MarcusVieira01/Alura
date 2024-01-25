from app import app, bot
from flask import render_template, request, Response, session, flash, redirect, url_for
import os 
from helpers import *
from conta_tokens import *
from resumidorHistorioco import criando_resumo
from models import usuarios

def trata_resposta(prompt,historico,nome_do_arquivo):
    resposta_parcial = ''
    historicoResumido = criando_resumo(historico)

    ## Comentado devida a implementação de resumo de histótico
    # limite_maximo_de_tokens = 2000
    # historico_parcial = limita_historico(historico,limite_maximo_de_tokens)

    for resposta in bot(prompt,historicoResumido):
        pedaco_da_resposta = resposta.choices[0].delta.get('content','')
        if len(pedaco_da_resposta):
            resposta_parcial += pedaco_da_resposta
            yield pedaco_da_resposta
    conteudo = f"""
    Historico: {historicoResumido}
    Usuário: {prompt}
    IA: {resposta_parcial}    
    """
    salva(nome_do_arquivo,conteudo)

## Comentado pois implementaremos resumo de histórico
# def limita_historico(historico,limite_maximo_de_tokens):
#     total_de_tokens = 0
#     historico_parcial = ''
#     for linha in reversed(historico.split('\n')):
#         tokens_da_linha = conta_tokens(linha)
#         total_de_tokens = total_de_tokens + tokens_da_linha
#         if (total_de_tokens > limite_maximo_de_tokens):
#             break
#         historico_parcial = linha + historico_parcial
#     return historico_parcial

@app.route("/")
def home():
    if 'usuario_logado' not in session or session['usuario_logado'] == None:
        return redirect(url_for('login'))
    return render_template("index.html")

@app.route("/chat",methods = ['POST'])
def chat():
    prompt = request.json['msg']
    nome_do_arquivo = session['usuario_logado'] + 'Historico.txt'
    historico = ''
    if os.path.exists(nome_do_arquivo):
        historico = carrega(nome_do_arquivo)
    return Response(trata_resposta(prompt,historico,nome_do_arquivo), mimetype = 'text/event-stream')

@app.route('/limparhistorico', methods = ['POST'])
def limpar_historico():
    nome_do_arquivo = session['usuario_logado'] + 'Historico.txt'
    if os.path.exists(nome_do_arquivo):
        os.remove(nome_do_arquivo)
        print("Arquivo removido!")
    else: 
        print("Não foi possivel remover esse arquivo")
    return {}

@app.route('/login')
def login():
    return render_template('login.html', proxima='/')

@app.route('/autenticar', methods=['POST',])
def autenticar():
    if request.form['usuario'] in usuarios:
        usuario = usuarios[request.form['usuario']]
        if request.form['senha'] == usuario.senha:
            session['usuario_logado'] = usuario.nickname
            flash(usuario.nickname + ' logado com sucesso!')
            return redirect(request.form['proxima'])
    else:
        flash('Usuário não logado.')
        return redirect(url_for('login'))
    
@app.route('/logout')
def logout():
    session['usuario_logado'] = None
    flash('Logout efetuado com sucesso!')
    return redirect(url_for('login'))

