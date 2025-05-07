package src.OrientacaoAObjetos.ModificadorFinal.dominio;

// public final Carro - Significa que ninguém pode extender essa classe
// Isso pode ser útil quando você não quer que outra classe sobrescreva os métodos, por exemplo. Um Object que vem assim por padrão é a String
public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // Quando uma variável numérica é criada sem valor, ela começa com 0. Só que, é impossível criar uma constante sem valor
    /* No outro exercício tinha sido usado como static, o que não é um erro. Porém, depende do objetivo do programa. Se a intenção for poder mudar: static. Caso contrário,
    static final

    Uma constante até pode ser declarada sem valor, porém terá de ter um construtor que receberá um valor para a constante. Isso implica que toda instância da classe terá
    um novo valor de constante. Por isso é normal utilizar static final.

    Public Carro (final double VELOCIDADE_LIMITE)
        this.VELOCIDADE_LIMITE = VELOCIDADE_LIMITE;
     */
    public final Comprador COMPRADOR = new Comprador(); // o new Comprador(); define que existe um comprador já atrelado ao carro que não precisa ser criado na main, por exemplo
    // o final comprador define que uma referência nunca poderá ser reutilizada após a sua criação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        // Por ele ser final, ele não poderá ser sobrescrito
        System.out.println(this.nome);
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }

}
