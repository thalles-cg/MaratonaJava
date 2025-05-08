package src.OrientacaoAObjetos.Polimorfismo.servico;

import src.OrientacaoAObjetos.Polimorfismo.repositorio.Repositorio;

public class RespositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
