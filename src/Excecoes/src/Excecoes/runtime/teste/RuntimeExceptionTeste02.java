package src.Excecoes.src.Excecoes.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0)); // -> ArithmeticException
    }
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, o divisor não pode ser 0");
            // Se esse if for true e acontecer uma exceção, o restante do método_ não acontece.
        }
        return a / b;
//        try {
//            return a / b;
//        } catch (RuntimeException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
