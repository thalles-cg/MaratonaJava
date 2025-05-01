package src.OrientacaoAObjetos.IntroducaoMetodos.dominio;

import java.util.ArrayList;

public class Funcionario {
    // O modificar de acesso (private, public, protected e default);
    // O public significa que qualquer objeto pode acessá-lo
    /*
     O private signfica que apenas a próprio escopo, a própria classe, pode acessá-la. Isso é interessante, pois quando não fazemos isso qualquer um pode alterar um
     os atributos de um objeto por acesso direto. Ex: Funcionario.nome = "Thalles". Essa maneira muitas vezes dá brecha para coisas que não eram para ocorrer. Por exemplo,
     Se eu tentar alterar o atributo da formar anterior e a classe estiver como 'private' ela não poderá ser acessada. Isso dá a possibilidade de criar um metodo para criar
     e adicionar uma condição para que ela seja aceita.
     Ex:
     public void setIdade(num idade){
        if (idade < 0){
           System.out.println("Idade inválida.");
        }
     }
     */
    // O default é como ele vem por padrão. Todos as classes que estiverem dentro do mesmo pacote tem acesso à ela. Também é chamado de packet-private
    // O protected só pode ser acessada pela mesma classe ou por subclasses. Subclasses são classes extendidas de uma superclasse, também chamadas de classes filhas.

    private String nome;
    private int idade;
    private double salario;

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
