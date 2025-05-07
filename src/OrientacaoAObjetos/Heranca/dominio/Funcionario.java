package src.OrientacaoAObjetos.Heranca.dominio;

public class Funcionario extends Pessoa {

    // O extends significa que funcionário terá todos os métodos e atributos da classe pessoa.
    // O extends é pra quando "algo é algo do outro" e associação é quando "algo tem algo do outro"
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
