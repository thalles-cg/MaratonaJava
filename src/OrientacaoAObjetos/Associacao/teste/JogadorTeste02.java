package src.OrientacaoAObjetos.Associacao.teste;

import src.OrientacaoAObjetos.Associacao.dominio.Jogador;
import src.OrientacaoAObjetos.Associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
