package src.OrientacaoAObjetos.ModificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
    // static significa que, ao alterar a velocidadeLimite de um objeto, ele estará alterando o de todos ao mesmo tempo

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    // Se eu colocasse this.velocidadeLimite, ele ainda vai funcionar, mas vai mostrar um erro. Isso acontece porque o this serve para pegar os atributos de uma instância,
    // e o velocidadeLimite não faz parte de uma instância, ele faz parte do objeto inteiro que gera essa instância.
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }
    // Nesse caso, comparando com o anterior, o this nem sequer funcionaria. Isso acontece, porque no caso passado para o metodo 'imprime' ser chamado, já deveria existir uma
    // instância. O que implica que o velocidadeLImite já existiria, já que ele vem por padrão nesta classe. Isso fica mais evidente pensando que a velocidadeLimite pode
    // ser alterada na Main mesmo sem uma instância existir.
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // Geralmente statics são usados em métodos quando eles não alteram atributos de instâncias
}
