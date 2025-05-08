package src.OrientacaoAObjetos.Polimorfismo.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 6;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomates");
        return valor * (IMPOSTO_POR_CENTO)/100;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
