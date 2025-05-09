package src.Exercicios;

public class Ex18 {
    public static void main(String[] args) {
        // 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
        // Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

        float alturaFrancisco = 150;
        float alturaSara = 110;

        int anos = 0;
        while (alturaSara <= alturaFrancisco){
            alturaFrancisco += 2;
            alturaSara += 3;
            anos++;
        }
        alturaFrancisco /= 10;
        alturaSara /= 10;
        System.out.println("A sara terá uma altura maior que Francisco em " + anos + " anos, quando Francisco tiver " + alturaFrancisco + "m e Sara tiver " + alturaSara + "m");

    }
}
