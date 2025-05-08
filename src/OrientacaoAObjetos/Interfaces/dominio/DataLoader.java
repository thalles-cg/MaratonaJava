package src.OrientacaoAObjetos.Interfaces.dominio;

public interface DataLoader { // (carregador de dados)

    int MAX_DATA_SIZE = 10; // Todos atributos numa interface são constantes.
    void load(); // Em 'interfaces', quando o método_ não tem modificadores de acesso, fica implícito que há um public abstract
    default void checkPermission(){
        // Ao invés de implementar um a um, é possível criar um método_ que será usado em todos os outros
        System.out.println("Fazendo checagem de permissões");
        // mesmo que ele seja implementado em todos sem ter de ser sobrescrito, ele ainda pode ser sobrescrito
    }
}
