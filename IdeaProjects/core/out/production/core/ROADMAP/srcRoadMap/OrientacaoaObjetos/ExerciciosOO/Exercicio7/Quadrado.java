package OrientacaoaObjetos.ExerciciosOO.Exercicio7;

public class Quadrado extends PolReg {
    public Quadrado(double tamanhoDoLado) {
        super(4, tamanhoDoLado);
    }

    @Override
    public double calcularArea() {
        resultado = tamanhoDoLado * tamanhoDoLado;
        return resultado;
    }
}
