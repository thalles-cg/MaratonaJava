package src.Excecoes.src.Excecoes.runtime.teste;

public class RuntimeException04 {
    public static void main(String[] args) {

        try{
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
            // Uma exceção menos específica não pode aparecer antes das mais específicas. Portanto, o RuntimeException tem de ser o último catch.
        }

    }
}
