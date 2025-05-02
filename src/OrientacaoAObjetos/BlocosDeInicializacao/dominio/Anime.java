package src.OrientacaoAObjetos.BlocosDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[]episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    {
        // Tudo que está dentro daqui é parte do bloco de inicialização. Ele serve para sempre executar um código independente do construtor que for usado
        // para criação de um novo objeto.
    }

    public Anime() {
        for(int episodio : episodios){
            System.out.println(episodio + " ");
        }
    }
}
