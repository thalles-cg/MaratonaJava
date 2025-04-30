package src.OrientacaoAObjetos.Introducao.test;

import src.OrientacaoAObjetos.Introducao.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Isto é uma variável de referência do tipo estudante. Isso significa que terá de ser utilizada a palavra "new"
        Estudante estudante = new Estudante();

        estudante.nome = "Stuart";
        estudante.idade = 16;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
