package OrientacaoaObjetos.HerancaCursoJava;

public class Ferrari extends Carro{
    public void acelerar() {
        velocidadeAtual += 20;
        if (velocidadeAtual >= 200) {
            System.out.println("Reduza a velocidade!");
        }
        if (velocidadeAtual >= 240) {
            System.out.println("Voce bateu! e morreu...");

        }
    }

    public void freiar() {
        if (velocidadeAtual <= 0) {
            System.out.println("O carro esta parado!!");
        } else if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        }
    }

    public String toString() {
        return "Ferrari, voce esta a " + velocidadeAtual + "Km/h";
    }
}