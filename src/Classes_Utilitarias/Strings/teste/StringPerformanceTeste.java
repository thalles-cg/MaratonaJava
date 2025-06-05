package src.Classes_Utilitarias.Strings.teste;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        System.out.println("Texto: " + concatString(1_000_000));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + " ms");

    }

//    private static void concatString(int tamanho) {
//        String texto = "";
//        for (int i = 0; i < tamanho; i++) {
//            texto += i; // Cria uma nova string por iteração, sendo cada nova string um novo espaço alocado na memória heap
//        }
//    }
    private static StringBuilder concatString(int tamanho){
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
        return texto;
    }
}
