package OrientacaoaObjetos.ExerciciosOO.Exercicio7;

public class TrianguloEq extends PolReg {

    public TrianguloEq(double tamanhoDoLado) {
        super(3, tamanhoDoLado);
    }

    @Override
    public double calcularArea() {
        resultado = (double) (1.732 * (tamanhoDoLado * tamanhoDoLado) / 4);
        return resultado;
    }
}
