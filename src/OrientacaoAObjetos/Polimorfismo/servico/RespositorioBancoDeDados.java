package src.OrientacaoAObjetos.Polimorfismo.servico;

import src.OrientacaoAObjetos.Polimorfismo.repositorio.Repositorio;

public class RespositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
