package OrientacaoaObjetos.ExerciciosOO2.Exercicio9;

import java.util.Scanner;

public class ConjuntoTeste {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();
        Conjunto conjunto3 = new Conjunto();

        int elemento1;
        int elemento2;
        int elemento3;

        try {
            System.out.println("Digite os 3 primeiros elementos!");
            System.out.print("Digite o numero 1: ");
            elemento1 = scanner.nextInt();
            System.out.print("Digite o numero 2: ");
            elemento2 = scanner.nextInt();
            System.out.print("Digite o numero 3: ");
            elemento3 = scanner.nextInt();

            conjunto1.adicionarElemento(elemento1);
            conjunto1.adicionarElemento(elemento2);
            conjunto1.adicionarElemento(elemento3);

            System.out.println("\nDigite os 3 segundos elementos!");
            System.out.print("Digite o numero 1: ");
            elemento1 = scanner.nextInt();
            System.out.print("Digite o numero 2: ");
            elemento2 = scanner.nextInt();
            System.out.print("Digite o numero 3: ");
            elemento3 = scanner.nextInt();

            conjunto2.adicionarElemento(elemento1);
            conjunto2.adicionarElemento(elemento2);
            conjunto2.adicionarElemento(elemento3);

            System.out.println("\nElemento 1 e elemento 2 juntos, sem duplicidade de numeros: " + conjunto1.uniao(conjunto1.elementos, conjunto2.elementos, conjunto3.elementos));
            System.out.println("Numeros repetidos que contem em elementos 1 e elementos 2: " + conjunto1.inter(conjunto1.elementos, conjunto2.elementos));
            System.out.println("Numeros que contem no elemento 1 e que nao tenha no elemento 2: " + conjunto1.menos(conjunto2.elementos));
        } catch (Exception e) {
            System.out.println("Digite um elemento valido, tente novamente...");
        }
    }
}
