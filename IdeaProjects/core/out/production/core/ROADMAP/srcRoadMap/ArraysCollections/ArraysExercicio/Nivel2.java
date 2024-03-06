package ArraysCollections.ArraysExercicio;

import ArraysCollections.CursoArray.ArrayGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Nivel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero minimo: ");
        int minimo = scanner.nextInt();
        System.out.println("Digite o numero maximo: ");
        int maximo = scanner.nextInt();

        int [] numeros = ArrayGenerator.generateIntArray(10);
        System.out.println(Arrays.toString(numeros));

        valoresEntre(minimo, maximo, numeros);
    }

    public static void valoresEntre(int minimo, int maximo, int[] numeros){
        StringBuilder valoresEntre = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= minimo && numeros[i] <= maximo){
                valoresEntre.append(numeros[i] + ",");
            }
        }

        String[] numerosNovos = valoresEntre.toString().substring(0, valoresEntre.length()-1).split(",");

        System.out.println(Arrays.toString(numerosNovos) + " Tamanho: "+ numerosNovos.length);
    }
}


