package OrientacaoaObjetos.ExerciciosOO.Exercicio7;

abstract public class PolReg {
    double numeroDeLados;
    double tamanhoDoLado;
    double resultado;

   public double calcularPerimetro() {
    resultado = tamanhoDoLado * numeroDeLados;
   return resultado;
   }
   public double calcularAnguloInterno() {
        resultado = (numeroDeLados - 2) * 180;
       return  resultado;
   }
   public double calcularArea() {
    return 0;
   }

    public PolReg(double numeroDeLados, double tamanhoDoLado) {
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }
}
