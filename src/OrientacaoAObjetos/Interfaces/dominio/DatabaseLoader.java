package src.OrientacaoAObjetos.Interfaces.dominio;

// Uma classe só pode estender 1 outra classe. Porém, uma classe pode implementar várias outras classes sem um número limite.
public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }
}
