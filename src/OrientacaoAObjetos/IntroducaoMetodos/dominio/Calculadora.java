package src.OrientacaoAObjetos.IntroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //  Se esse metodo for passado dentro de um println "System.out.println(imprimeDivisaoDeDoisNumeros(28, 2)" acontecerá um problema, pois
    //  dentro do println há a necessidade de o metodo retornar algo. Porém, o return ainda pode ser usado dentro de um metodo void com um
    // funcionamento parecido com um break

    public void imprimeDivisaoDeDoisNumeros (double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }

    public boolean verificaPrimo (int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] dobrarArray (int [] numArray) {
        int[] novoArray = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            novoArray[i] = numArray[i] * 2;
            System.out.println(novoArray[i]);
        }
        return novoArray;
    }
}

