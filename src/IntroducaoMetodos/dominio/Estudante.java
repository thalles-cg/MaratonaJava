package src.IntroducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //this é uma palavra reservada que serve para se comunicar com um atributo de dentro do escopo do objeto
    public void imprime(){
        System.out.println("===================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
