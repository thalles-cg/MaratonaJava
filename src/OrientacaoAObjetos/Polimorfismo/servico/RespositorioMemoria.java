package src.OrientacaoAObjetos.Polimorfismo.servico;

import src.OrientacaoAObjetos.Polimorfismo.repositorio.Repositorio;

public class RespositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
