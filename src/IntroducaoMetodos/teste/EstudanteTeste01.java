package src.IntroducaoMetodos.teste;

import src.IntroducaoMetodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Jonathan";
        estudante1.idade = 17;
        estudante1.sexo = 'H';

        estudante2.nome = "Carla";
        estudante2.idade = 28;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
