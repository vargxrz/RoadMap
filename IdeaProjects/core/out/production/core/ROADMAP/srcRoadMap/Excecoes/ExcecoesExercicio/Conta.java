package Excecoes.ExcecoesExercicio;

import java.util.concurrent.ExecutionException;

public class Conta {

   private double saldo;

    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void sacar(double valorSaque) throws ContaExcecao {
        if (valorSaque <= limite + saldo) {
            saldo -= valorSaque;
        } else {
            throw new ContaExcecao("Saldo insuficiente para realizar o saque.", saldo);
        }
    }
    public double depositar(double valorDeposito) {
       return saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "seu saldo atual apos transação é de: " + saldo;
    }
}
