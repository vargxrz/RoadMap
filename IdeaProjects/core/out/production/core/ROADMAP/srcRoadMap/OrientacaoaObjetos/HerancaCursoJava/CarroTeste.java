package OrientacaoaObjetos.HerancaCursoJava;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        int movimentarCarro;
        int escolhaCarro;
        int opcao = 0;

        Carro carro = null;


        Scanner scanner = new Scanner(System.in);

        System.out.print("1 - Civic \n2 - Ferrari\nEscolha seu carro: " );
        escolhaCarro = scanner.nextInt();
        if (escolhaCarro == 1){
            carro = new Civic();
        } else if (escolhaCarro == 2) {
            carro = new Ferrari();
        }
        while (opcao != 3) {
            System.out.println("1 - Acelerar\n2 - Freiar\n3- Sair\nDigite sua escolha: ");
            opcao = scanner.nextInt();
            if (opcao == 1){
                carro.acelerar();
            } else if (opcao == 2) {
                carro.freiar();
            } else {
                System.out.println("Numero invalido!");
            }
            System.out.println(carro.toString());
        }
    }
}
