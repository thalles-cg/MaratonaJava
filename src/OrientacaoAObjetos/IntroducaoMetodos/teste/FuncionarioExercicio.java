package src.OrientacaoAObjetos.IntroducaoMetodos.teste;

import src.OrientacaoAObjetos.IntroducaoMetodos.dominio.Funcionario;
import src.OrientacaoAObjetos.IntroducaoMetodos.dominio.Impressora;

public class FuncionarioExercicio {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setNome("Péricles");
        funcionario1.setSalario(2000);
        funcionario1.setIdade(47);

        funcionario2.setNome("Jonathan");
        funcionario2.setSalario(3000);
        funcionario2.setIdade(24);

        funcionario3.setNome("Elias");
        funcionario3.setSalario(4000);
        funcionario3.setIdade(18);

        Impressora impressora = new Impressora();
        impressora.imprimirMedia(funcionario1, funcionario2, funcionario3);
    }
}
