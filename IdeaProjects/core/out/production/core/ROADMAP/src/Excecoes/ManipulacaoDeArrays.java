package Excecoes;

public class ManipulacaoDeArrays {
    public static void main(String[] args) {

        try {
            int[] array = {1, 2, 3, 4, 5, 6};
            int elemento = array[5];
            System.out.println("Elemento " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO! Indice do array fora dos limites...");
        }
    }
}
