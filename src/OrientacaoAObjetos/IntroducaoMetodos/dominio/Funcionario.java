package src.OrientacaoAObjetos.IntroducaoMetodos.dominio;

import java.util.ArrayList;

public class Funcionario {
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
