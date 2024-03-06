package Excecoes.ExcecoesExercicio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r;

        System.out.println("Eu sei dividir!");
        System.out.println("Informe o primeiro valor: ");
        int x = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        int y = scanner.nextInt();
        try {
            r  = (x / y);
            System.out.println("O resultado é de : " + r);
        } catch (Exception e) {
            System.out.println("Numero nao divisil por zero!");
        }

    }
}
