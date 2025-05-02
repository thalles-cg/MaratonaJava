package src.OrientacaoAObjetos.ModificadorEstatico.domain;

public class Anime {
    private String nome;
    private static int[]episodios;

    static {
        // Tudo que está dentro daqui é parte do bloco de inicialização. Ele serve para sempre executar um código independente do construtor que for usado
        // para criação de um novo objeto.
        System.out.println("======================");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public Anime() {

    }
}
