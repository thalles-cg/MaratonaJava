package src.Classes_Utilitarias.Strings.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";

        System.out.println(nome.charAt(0));
        System.out.println(nome.replace('f', 'l'));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.substring(0, 4)); // do numeros[0] até numeros[3]
        System.out.println(numeros.substring(2)); // do numeros[2] até o último


    }
}
