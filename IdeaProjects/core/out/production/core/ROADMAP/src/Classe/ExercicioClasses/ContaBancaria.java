package Classe.ExercicioClasses;

public class ContaBancaria {

    int numeroDaconta;
    String nomeTitular;

    double saldo;

    public ContaBancaria(int numeroDaconta, String nomeTitular, double saldo){
        this.numeroDaconta = numeroDaconta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public void depositar(double valorDeposito) {

        saldo += valorDeposito;
    }
    public void sacar(double valorSaque) {

        saldo -= valorSaque;
    }
}
