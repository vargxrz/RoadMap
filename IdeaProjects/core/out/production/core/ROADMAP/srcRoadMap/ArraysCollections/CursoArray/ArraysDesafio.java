package ArraysCollections.CursoArray;

import java.util.Scanner;

public class ArraysDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Quantas notas voce quer informar ?\nDigite: ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double mediaNotas = 0;

        System.out.print("\nNotas: ");
        for (double nota: notas){
            mediaNotas += nota;
            System.out.print(nota + ", ");
        }
            System.out.println("\n\nA media do aluno é: " + mediaNotas / notas.length);

    }
}
