package br.com.javautil.modelo;

public abstract interface Autenticavel{
    //COMENTADO PARA DEFINIR A CLASSE COMO ABSTRATA E TRANSFORMAR EM INTERFACE
    //Declaração de atributos apenas da classe gerente
    // private int senha;

    //Método setter para um atributo de interface
    public abstract void setSenha(int senha);
    
    //COMENTADO PARA DEFINIR A CLASSE COMO ABSTRATA E TRANSFORMAR EM INTERFACE
    //Declaração de método de autenticação
    public abstract boolean autenticacao(int senha);
    
        // if(this.senha == senha){
        //     return true;
        // }else{
        //     return false;
        // }
}
