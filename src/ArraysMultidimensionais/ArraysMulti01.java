package src.ArraysMultidimensionais;

public class ArraysMulti01 {
    public static void main(String[] args) {
         /*
    Array mutldimensional é um array dentro de outro array
     */
        // Só é preciso definir o tamanho inicial. Não precisa definir os arrys que ficarão dentro de outro array
        // int[][] meses = new int[12][]; - é valido
        int[][] meses = new int[12][31];

    /* O Array Multidimensional é um endereço de memória que aponta para outro endereço de memória
    Ou seja, quando selecionamos apenas um dos arrays, ele retornará seu endereço
     */
        System.out.println(meses[0]);

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                System.out.println(meses[i][j]);
            }
        }

        //foreach
        for (int[]mesArray : meses) {
            for(int mes : mesArray){
                System.out.println(mes);
            }
        }
        // Forma diferente de inicialização
        int[][] dias = new int[3][];

        // Forma 1
        int[][]array = {{1,2}, {5,6,8,9}, {1}};
        // Forma 2
        dias[0] = new int[4];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[6];
    }
}
