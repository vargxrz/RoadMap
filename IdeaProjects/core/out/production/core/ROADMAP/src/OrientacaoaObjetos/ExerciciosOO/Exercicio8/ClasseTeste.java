package OrientacaoaObjetos.ExerciciosOO.Exercicio8;

public class ClasseTeste {
    public static void main(String[] args) {
        float real = 5;
        float imag = 4;
        Complexo complexo = new Complexo(real, imag);
        Real real1 = new Real(real);

        System.out.println(complexo.angulo());
        System.out.println(complexo.modulo());
        System.out.println(real1.sinal());
    }
}
