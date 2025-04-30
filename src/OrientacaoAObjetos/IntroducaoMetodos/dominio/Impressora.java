package src.OrientacaoAObjetos.IntroducaoMetodos.dominio;

public class Impressora {

    public void imprimirMedia (Funcionario...funcionarios){
        double media = 0;
        for (Funcionario funcionario: funcionarios){
            media += funcionario.getSalario();
        }
        System.out.println(media/funcionarios.length);
    }
}
