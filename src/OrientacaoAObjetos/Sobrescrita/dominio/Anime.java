package src.OrientacaoAObjetos.Sobrescrita.dominio;

public class Anime {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Esse toString é a sobrescrita do toString do Object
    @Override // O override não é necessário desde que o nome esteja exatamente igual à classe pai. Ou seja, pode ser bom deixar mesmo que não seja necessário, pois
    // ajuda a confirmar que uma sobrescrita ocorreu, e não uma criação de um método_ novo (que poderia acontecer ao errar o nome, por exemplo).
    public String toString() {
        return "";
    }
}
