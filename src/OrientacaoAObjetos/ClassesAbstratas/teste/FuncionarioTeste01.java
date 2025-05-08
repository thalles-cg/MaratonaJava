package src.OrientacaoAObjetos.ClassesAbstratas.teste;

import src.OrientacaoAObjetos.ClassesAbstratas.dominio.Desenvolvedor;
import src.OrientacaoAObjetos.ClassesAbstratas.dominio.Funcionario;
import src.OrientacaoAObjetos.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("nome1", 2000);
        Gerente gerente = new Gerente("nome2", 5000);

        //Obs: o toString pode ser herdado pelo funcionário
        System.out.println(desenvolvedor);
        System.out.println(gerente);

    }
}
