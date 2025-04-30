package src.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        Utilizar arrays para guardar um n úmero grande de informações relacionadas
        Somente tipos de referência aceitam o valor "null"
        Um tipo de referência é aquele que não armazenam as variáveis em si, mas sim o endereço das variáveis dentro dela
        */
        int [] idades = new int[3];
        //System.out.printf(idades);  ao ser printado um objeto, ele apenas demosntra seu endereço na memória
        //para inicializar um array é preciso determinar quanto espaço da memória ele alocará
        //array tem valor inicial igual a 0 se for numérico e null se for String
        System.out.println(idades[1]);
        // atribuição de valor
        idades[0] = 5;


        // Arrays não são dinâmicos
        String[] nomes = new String[2];
        nomes[0] = "jonathan";
        nomes[1] = "josias";
        nomes = new String[2];

        /* Ele irá printar "null null", pois a partir do momento que é criado um novo objeto,
            A referência antiga dele é perdida. As referências não são restauráveis.
         */
        System.out.println(nomes[0] + " " + nomes[1]);

        nomes[0] = "manuel";
        nomes[1] = "elias";
        for(String nome: nomes){
            System.out.println(nome);
        }

    }
}
