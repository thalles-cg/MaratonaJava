package src.IntroducaoMetodos.SobrecargaDeMetodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;

    /*
     Por definição, toda classe já tem um construtor padrão que o java cria na compilação. Portanto, se o construtor não existir ou não fizer nada, ele será criado dentro do
     class, já que todos objetos precisam de um construtor.
     OBS: O class só cria um construtor para os objetos que ainda NÃO tem um. Ainda assim, é possível criar um construtor para definir que um objeto poder começar sem argumentos

    Exemplo dos dois contrutores sendo chamados ao mesmo tempo:
     */
    public Anime(String nome, String tipo){
        this(); //obs: quando o construtor é chamado dentro de outro, é preciso que ele esteja na primeira linha
        this.nome = nome;
        this.tipo = tipo;
    }
    public Anime(){

    }

    /*
     Sobrecarga de métodos é quando utilizamos métodos com o mesmo nome, porém com parâmetros diferentes, e logo depois chama o metodo com menos parâmetros dentro do que tem
     mais parâmetros. Nesse caso, por exemplo, a utilidade é poder iniciar um metodo sem afetar outro
     */
    public void init(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public void init(String nome, String tipo, int episodios){
        this.init(nome, tipo);
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios (int episodios){
        this.episodios = episodios;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }
}
