function chutar() {
    let chute = parseInt(document.getElementById("valor").value);
    let elementoResultado = document.getElementById('resultado'); 
    
    if (chute < 0 || chute > 10) {
      elementoResultado.innerHTML = "Numero fora do range";
    } else if (chute === numeroSecreto) {
      elementoResultado.innerHTML = "Acertou!";
    } else {
      elementoResultado.innerHTML ="ERRRRRRROU!";
    };
  };
  
  let numeroSecreto = parseInt(Math.random() * 11);
  console.log(numeroSecreto);
  