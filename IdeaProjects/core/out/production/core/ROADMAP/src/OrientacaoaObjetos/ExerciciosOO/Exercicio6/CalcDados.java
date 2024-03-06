package OrientacaoaObjetos.ExerciciosOO.Exercicio6;

public class CalcDados {

  private double primeiroNumero;
   private double segundoNumero;
   private char operacao;
   private double resultado;

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String toString() {
        return primeiroNumero + " " + operacao + " " + segundoNumero + " = " + resultado;
    }

}
