package src.Excecoes.src.Excecoes.error.teste;

public class    StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
        // Uma stack é uma sequência de chamadas na memória. Um stackoverflow acontece quando essa chamada acontece tantas vezes, que acaba o espaço de memória de uma stack.
        // O stackoverflow é um erro. Erros são falhas no sistema que não são recuperáveis, que quando acontecessem há a necessidade de reiniciar o programa.
    }
    public static void recursividade(){
        recursividade();
    }
}
