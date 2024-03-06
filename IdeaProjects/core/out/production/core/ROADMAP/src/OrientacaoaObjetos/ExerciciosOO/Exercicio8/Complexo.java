package OrientacaoaObjetos.ExerciciosOO.Exercicio8;

public class Complexo {

    float real;
    float imag;

    public Complexo(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    public float modulo() {
        return (float) Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    public float angulo() {
        double anguloRadianos = Math.atan2(imag, real);
        double anguloGraus = Math.toDegrees(anguloRadianos);
    return (float) anguloGraus;
    }

}
