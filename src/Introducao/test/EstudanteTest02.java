package src.Introducao.test;
import src.Introducao.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        // Cria um espaço na memória sem se referenciar a ele. Ou seja, ele não é atribuído à nada.
        new Estudante();

        Estudante estudante = new Estudante();

        /*
         Quando os atributos dentro de um objeto não tem um valor inicial antes de serem printados, eles terão
         o valor inicial padrão de cada tipo.
         */
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        // Há uma maneira de alterar o valor de inicialização colocando um valor dentro de um atributo da classe Estudante, porém não é recomendado.

        // Coesão
        // Uma classe coesa é aquela que não mistura o seu propósito de existir. Por exemplo, uma classe deve ter apenas informações que são referentes à ela mesma.
    }
}
