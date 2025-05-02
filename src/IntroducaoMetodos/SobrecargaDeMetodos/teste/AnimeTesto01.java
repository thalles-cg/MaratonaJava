package src.IntroducaoMetodos.SobrecargaDeMetodos.teste;

import src.IntroducaoMetodos.SobrecargaDeMetodos.dominio.Anime;

public class AnimeTesto01 {
    public static void main(String[] args) {
        // Os parentêses do 'new Anime()' não são de um metodo, mas sim de um construtor
        Anime anime = new Anime("Hunter X Hunter", "TV");
        Anime anime2 = new Anime();
        anime.init("Hunter X Hunter", "TV", 12);
        anime.imprime();


    }
}
