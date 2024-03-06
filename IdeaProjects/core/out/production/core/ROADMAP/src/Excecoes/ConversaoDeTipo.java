package Excecoes;

public class ConversaoDeTipo {
    public static void main(String[] args) {
        try {
            Object objeto = "123";
            Integer numero = (Integer) objeto;
            System.out.println("Numero " + numero);
        } catch (ClassCastException e) {
            System.out.println("ERRO! conversao de tipo invalida...");
        }
    }
}
