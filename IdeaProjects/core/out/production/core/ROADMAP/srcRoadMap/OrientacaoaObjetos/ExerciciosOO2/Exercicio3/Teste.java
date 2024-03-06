package OrientacaoaObjetos.ExerciciosOO2.Exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    private static Scanner scanner;

    public static void main(String[] args) throws DivisaoPorZeroException {
        scanner = new Scanner(System.in);
        double numeroimaginario;
        double numerointeiro;
        NumeroComplexo numeroComplexo = new NumeroComplexo();
        NumeroComplexo numeroComplexo1 = new NumeroComplexo();

        int opcao = 1;
        while (opcao == 1){
            try {
                System.out.println("Digite um numero inteiro: ");
                numerointeiro = scanner.nextDouble();
                numeroComplexo.setParteInteira(numerointeiro);
                numeroComplexo1.setParteInteira(numerointeiro);

                System.out.println("Digite um numero imaginario: ");
                numeroimaginario = scanner.nextDouble();
                numeroComplexo.setParteImaginaria(numeroimaginario);
                numeroComplexo1.setParteImaginaria(numeroimaginario);
            } catch (InputMismatchException e) {
                System.out.println("Opcao invalida, Somente numeros!");
                scanner = new Scanner(System.in);
            } catch (NumeroNegativoException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println(numeroComplexo.toString());
                System.out.println("Deseja continuar?\n1-Sim\n2-Não");
                opcao = scanner.nextInt();
            }
        }

        try {
           numeroComplexo.dividir(numeroComplexo1);
            System.out.println(numeroComplexo.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//        NumeroComplexo numeroComplexo = new NumeroComplexo(inteiro, imaginario);
//
//        System.out.print("\nDigite um numero inteiro 2: ");
//        double inteiro1 = scanner.nextDouble();
//        System.out.print("Digite um numero imaginario 2: \n");
//        double imaginario1 = scanner.nextDouble();
//
//        NumeroComplexo numeroComplexo1 = new NumeroComplexo(inteiro1, imaginario1);
//
//        numeroComplexo.somar(numeroComplexo1);
//        numeroComplexo.subtrair(numeroComplexo1);
//        System.out.println(numeroComplexo.toString());
//        System.out.println(numeroComplexo1.toString());
//        System.out.println(numeroComplexo.comparacao(numeroComplexo1));
//        System.out.println(numeroComplexo.retornarModulo());
//
