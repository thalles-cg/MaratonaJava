package src.OrientacaoAObjetos.ClassesAbstratas.dominio;

// Quando uma classe abstrata estende outra classe abstrata, ela obriga todos os métodos da classe abstrata pai a serem passadas para as classes filhas da classe abstrata filha
// Ex: A classe funcionário estende pessoa e as classes funcionário e gerente estendem funcionário. Isso obriga a classe funcionário e gerente a terem todos os métodos da classe
// pessoa ou à classe pessoa a ter o método_ da pessoa.
public abstract class Pessoa {
    public abstract void imprime();
}
