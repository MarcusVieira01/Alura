//Declaração de pacote
package br.com.alura.rh.servicePromocao;

//Importação de classes internas
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Classe que define o método para realizar a promoção de um funcionário, evocando a modificação do atrinuto cargo do objeto Funcionario
 */
public class PromocaoService {
    /**
     * Declaração de método que fará a alteração do valor do atributo cargo no objeto Funcionario, após validações
     * @param funcionario
     * @param metaBatida
     */
    public void promover(Funcionario funcionario, boolean metaBatida){
        //Declaração de variável loal e atribuição do valor de retorno do método .getCargo() do objeto Funcionário
        Cargo cargoAtual = funcionario.getCargo();
        //Implementação de failfast para validação se o cargo atual é gerente, com lançamento de exceção caso true
        if(cargoAtual == Cargo.GERENTE){
            throw new ValidacaoException("Cargo incompatível com a promoção");
        }
        //Condicional que se o valor da variável metaBatia for true, fará a modificação do valor do atributo cargo do objeto Funcionario
        if(metaBatida){
            //Declaração de variável local e atribuição do valor de retorno do método getProximoCargo() do enum Cargo
            Cargo novoCargo = cargoAtual.getProximoCargo();
            //Evocação de método que fará a modificação do valor do atributo cargo do objeto Funcionario
            funcionario.promover(novoCargo);
        //Condição else que lançará uma exceção caso a meta não seja batia (poderia ser implementado o fail fast)
        }else{
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
