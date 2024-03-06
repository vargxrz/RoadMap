package OrientacaoaObjetos.ExerciciosOO.Exercicio7;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lados;
        double tamanho;
        System.out.println("Escolha sua opcao\n1 - Calcular polígono regular\n2 - Calcular area do triângulo equilátero\n" +
                "3 - Calcular area do quadrado\n4 - Sair\nDigite sua opcao: ");
        int escolha = scanner.nextInt();
        PolReg formageometrica = null;
        while (escolha != 4) {
            System.out.println("Digite o tamanho dos lados: ");
            lados = scanner.nextDouble();
            if (escolha == 1) {
                System.out.println("Digite a quantidade de lados: ");
                tamanho = scanner.nextDouble();
            }
            else if (escolha == 2) {
                formageometrica = new TrianguloEq(lados);
            }
             else if (escolha == 3) {
                formageometrica = new Quadrado(lados);
            }
             else {
                 System.out.println("Opcao invalida");
             }
            executarCod(formageometrica);

            System.out.println("\nEscolha sua opcao\n1 - Calcular polígono regular\n2 - Calcular area do triângulo equilátero\n" +
                    "3 - Calcular area do quadrado\n4 - Sair\nDigite sua opcao: ");
            escolha = scanner.nextInt();
        }
    }
    public static void executarCod(PolReg formageometrica){
        System.out.println(formageometrica.calcularPerimetro());
        System.out.println(formageometrica.calcularAnguloInterno());
        System.out.println(formageometrica.calcularArea());
    }
}


