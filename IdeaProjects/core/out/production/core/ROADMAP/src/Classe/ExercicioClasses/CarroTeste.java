package Classe.ExercicioClasses;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Porsche", "Macan", 95);

        System.out.println(carro.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Acelerar\n2-Freiar\n3-Sair\nDeseja realizar qual opção:");
        int opcao = scanner.nextInt();
        while (opcao != 3) {
            if (opcao == 1) {
                carro.acelerar();
            } else if (opcao == 2) {
                carro.freiar();

            }

            System.out.println("O carro esta a " + carro.velocidade + "Km" +
                    "\n1-Acelerar\n2-Freiar\n3-Sair\nDeseja realizar qual opção: ");
            opcao = scanner.nextInt();

        }
    }
}
