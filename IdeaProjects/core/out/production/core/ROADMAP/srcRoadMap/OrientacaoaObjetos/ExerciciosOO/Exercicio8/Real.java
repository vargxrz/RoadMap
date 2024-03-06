package OrientacaoaObjetos.ExerciciosOO.Exercicio8;

public class Real extends Complexo {
    public Real(float real) {
        super(real, 0);
    }
    public int sinal() {
        if (real >= 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
