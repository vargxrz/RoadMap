package ArraysCollections.ListExercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class NIvel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor minimo: ");
        int valorMinimo = scanner.nextInt();

        System.out.println("Digite um valor maximo: ");
        int valorMaximo = scanner.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(7);
        numeros.add(16);
        numeros.add(21);
        numeros.add(3);
        numeros.add(14);
        numeros.add(26);
        numeros.add(32);
        numeros.add(13);
        numeros.add(2);

        System.out.println(numeros);
        System.out.println("O valores entre " + valorMinimo +" e o " + valorMaximo + " é: " +valorEntre(valorMinimo, valorMaximo, numeros));
    }

    public static ArrayList<Integer> valorEntre(int valorMinimo, int valorMaximo, ArrayList<Integer> numeros){
        ArrayList<Integer> numerosEntre = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
           if (numeros.get(i) >= valorMinimo && numeros.get(i) <= valorMaximo){
               numerosEntre.add(numeros.get(i));
           }
        }
        return numerosEntre;
    }
}
