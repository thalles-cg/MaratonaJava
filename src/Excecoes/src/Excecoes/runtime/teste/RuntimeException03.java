package src.Excecoes.src.Excecoes.runtime.teste;

public class RuntimeException03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados do arquivo");
//            System.out.println("Fechando recurso liberado pelo SO");  Se acontecer problemas na etapa anterior, ele não chegará nessa linha e pulará para o catch
            
        } catch (Exception e){
//            System.out.println("Fechando recurso liberado pelo SO"); se eu quisesse printar isso mesmo ele sendo pulado no try, poderia colocar aqui, porém é melhor
//            pôr no finally
            e.printStackTrace();
        } finally {
            // O finally é um bloco que executa no final do try/catch (ele sempre executa)
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

}
