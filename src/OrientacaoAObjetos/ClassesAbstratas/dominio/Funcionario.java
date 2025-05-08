package src.OrientacaoAObjetos.ClassesAbstratas.dominio;

// Funcionário é uma classe abstrata porque é só uma generalização de outros vários tipos de funcionário
// Por exemplo, dentro numa empresa há vários cargos que um funcionário pode ter, porém, não existe um funcionário genérico. Ele sempre terá um cargo. Então não faz sentido
// Alguém ter a classe funcionário e não ter nenhum cargo. Como todos os cargos vão ser extensões do funcionário, então NINGUÉM deve instanciar diretamente à classe
// funcionário, o que torne ela abstrata
public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    // A finalidade dessa classe abstrata é basicamente obrigar a qualquer classe que extender funcionário a ter um próprio método_ calculaBonus.
    // Isso ajuda a nunca esquecer de colocar esse método_ todas as vezes que for criado um tipo de funcionário
    public abstract void calculaBonus();
    // Apenas classes abstratas podem ter métodos abstratos

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {

    }
}
