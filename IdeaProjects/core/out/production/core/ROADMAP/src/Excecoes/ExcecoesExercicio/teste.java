package Excecoes.ExcecoesExercicio;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Conta conta = new Conta(300, 500);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Limite atual " + conta.getLimite());

        try {
            System.out.print("Informe o valor do saque: ");
            double valorDeSaque = scanner.nextDouble();
            conta.sacar(valorDeSaque);
            System.out.println("Saque realizado com sucesso.\nNovo saldo: " + conta.getSaldo());
        }
        catch (ContaExcecao e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println(conta.getSaldo());
        }

    }
}



