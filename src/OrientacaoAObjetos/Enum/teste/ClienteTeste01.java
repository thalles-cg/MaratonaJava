package src.OrientacaoAObjetos.Enum.teste;

import src.OrientacaoAObjetos.Enum.dominio.Cliente;
import src.OrientacaoAObjetos.Enum.dominio.TipoCliente;
import src.OrientacaoAObjetos.Enum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        // Sempre que houver constantes dentro de uma classe que podem ser relacionadas, há uma boa chance de ser ENUM
        // O que o ENUM faz é diminuir a possibilidade escrever errado as variações de algo quando queremos que seja selecionado apenas coisas específicas.
        // Por exemplo, no caso abaixo, queremos que o tipo de pessoa seja jurídica ou física. Além disso, diminui a variação de escritas no tipo da pessoa.
        // Resumindo: O ENUM dá controle absoluto da informação que será passada como argumento
        Cliente cliente = new Cliente("Leandro", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Ronaldo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Alberto", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("João", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
