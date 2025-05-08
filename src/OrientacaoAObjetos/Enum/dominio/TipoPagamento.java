package src.OrientacaoAObjetos.Enum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.9; // 10% de desconto
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.95; // 5% de desconto
        }
    };

    public double calcularDesconto(double valor){
        return 0; // Como o método_ foi sobrescrito para quando houver um TipoPagamento, significa que ele retornará 0 apenas se não houver um TipoPagamento válido.
    }
    // Como a classe a cima não deve ser utilizada, ela é uma classe abstrata. (O professor explicará melhor depois)
    // public abstract  double calcularDesconto2 (double valor);
}
