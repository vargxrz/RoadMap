package Excecoes.ExcecoesExercicio;

public class ContaExcecao extends Exception{

    private double saldo;

    public ContaExcecao(String mensagem, double saldo) {
        super(mensagem);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
