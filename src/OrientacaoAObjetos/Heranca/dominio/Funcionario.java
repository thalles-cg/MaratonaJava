package src.OrientacaoAObjetos.Heranca.dominio;

public class Funcionario extends Pessoa {

    // O extends significa que funcionário terá todos os métodos e atributos da classe pessoa.
    // O extends é pra quando "algo é algo do outro" e associação é quando "algo tem algo do outro"

    // Importante lembrar que não exista herança multipla, uma classe não pode extender a mais de uma classe.
    private double salario;

    public Funcionario (String nome) {
        super(nome);
    }

    // interessante perceber que esse metodo existe na classe pessoa e que, portanto, a classe funcionário já tem o metodo imprime. Porém, se não criarmos um metodo imprime
    // para o funcionário, o salário não aparecerá. Então podemoos sobreescrever o metodo para mostrarmos o atributo salário
    public void imprime() {
        // super é relacionado à classe pai, porém todos os this._ irão ser relacionados à classe que foi executado, que nesse caso é funcionario
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento (){
        // Só é possível acessar esse nome quando o modificador de acesso dele for protected, pois o atributo nome vem da classe pessoa, a classe pai
        System.out.println("Eu " + this.nome + "recebi o salário de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
