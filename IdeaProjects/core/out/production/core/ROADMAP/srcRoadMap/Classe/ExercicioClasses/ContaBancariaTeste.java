package Classe.ExercicioClasses;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ContaBancariaTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        ContaBancaria banco = new ContaBancaria(numeroConta, nome, saldo);

        System.out.println("Deseja realizar qual opção \n1-Depositar\n2-Sacar\n3-sair");
        int opcao = scanner.nextInt();
        while(opcao != 3){
            if (opcao == 1){
                System.out.println("Digite o valor de deposito");
                double deposito = scanner.nextDouble();
                banco.depositar(deposito);
                System.out.println("Deposito realizado com sucesso. Novo saldo: "+ banco.saldo);
            }
            else {
                System.out.println("Digite o valor de saque");
                double valorSaque = scanner.nextDouble();
                if (saldoSuficiente(valorSaque, banco.saldo)){
                    banco.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso, novo saldo: "+ banco.saldo);
                }else {
                    System.out.println("Não foi possível realizar o saque, saldo indisponível: Saldo: "+ banco.saldo);
                }
            }

            System.out.println("Deseja realizar qual opção \n1-Depositar\n2-Sacar\n3-sair");
            opcao = scanner.nextInt();

        }
    }

    private static boolean saldoSuficiente(double valorSaque, double valorSaldo){

        return valorSaldo >= valorSaque;
    }
}
