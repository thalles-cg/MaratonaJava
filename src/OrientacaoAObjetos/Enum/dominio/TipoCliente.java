package src.OrientacaoAObjetos.Enum.dominio;

public enum TipoCliente {
    // todos atributos de um enum são constantes, public static final
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");


    private final int VALOR; // qualquer coisa que não seja enumeração tem de ver após as enumerações
    private final String NOME_RELATORIO;

    // por mais que aqui não apareça, ele cria um construtor privado sempre que roda o programa
    private TipoCliente (int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }
    // Enums não precisam de setters
    public int getValor() {
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }

    public static TipoCliente tipoClientePorRelatorio (String nomeRelatorio) {
        for (TipoCliente tipoCliente: values()){ // O values() pega todos os enums da classe Enum e os põe em um array.
            if (tipoCliente.getNOME_RELATORIO().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
}
