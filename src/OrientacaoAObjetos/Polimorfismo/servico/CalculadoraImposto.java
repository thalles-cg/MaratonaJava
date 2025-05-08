package src.OrientacaoAObjetos.Polimorfismo.servico;

import src.OrientacaoAObjetos.Polimorfismo.dominio.Computador;
import src.OrientacaoAObjetos.Polimorfismo.dominio.Produto;
import src.OrientacaoAObjetos.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador" + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate" + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    // Dessa maneira, tornando uma variável da classe produto um parâmetro, torna o código muito menos acoplado com as classes e mais com a sua generalização. Ou seja,
    // independente de qual seja a classe, se ela estender produto, poderá executar este método_.
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
//        Tomate tomate = (Tomate) produto; -> Isso é um cast. Como produto não tem acesse a dataValidade, ele transforma o produto em um tomate para fazer o processo
//        System.out.println(tomate.getDataValidade());
        // O problema é que, se o produto que for passado não for um tomate ocorrerá uma exceção
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
//            System.out.println(((Tomate) produto).getDataValidade()); -> mesma coisa que o de cima, porém mais simplificado
        }
    }
}
