package Excecoes;

public class FinanciamentoTeste {
    public static void main(String[] args) {

        double valorTotal = 1000.0;
        double entrada = 300.0;
        int parcelas = 7;

        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println("R$" + f.prestacao());
            throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
