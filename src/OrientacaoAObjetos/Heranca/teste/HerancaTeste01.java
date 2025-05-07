package src.OrientacaoAObjetos.Heranca.teste;

import src.OrientacaoAObjetos.Heranca.dominio.Endereco;
import src.OrientacaoAObjetos.Heranca.dominio.Funcionario;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("9350320-02");

        Funcionario funcionario = new Funcionario("Ricardo");
        funcionario.setCpf("455");
        funcionario.setSalario(30000);
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
