from django.shortcuts import render

# Definição de rotas
def index(request):
    dados ={
        1: {"nome"   :"Nebulosa de Carine",
            "legenda": "webbtelescope.org / NASA / James Web Space Telescope"},
        2: {"nome"   :"Galáxia NGC179",
            "legenda": "nasa.org / NASA / Hubble Space Telescope"},
    }
    return render(request, 'galeria/index.html', {'cards': dados})

def imagem(request):
    return render(request, 'galeria/imagem.html')

# Definição de funções
