package src.OrientacaoAObjetos.Polimorfismo.teste;

import src.OrientacaoAObjetos.Polimorfismo.repositorio.Repositorio;
import src.OrientacaoAObjetos.Polimorfismo.servico.RespositorioBancoDeDados;

public class RepositorioTeste01 {
    public static void main(String[] args) {

        Repositorio respositorio = new RespositorioBancoDeDados(); // Todos as classes que implementam o método_ salvar() do repositório podem ser postas aqui
        respositorio.salvar();

    }
}
