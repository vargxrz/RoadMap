package OrientacaoaObjetos.HerancaCursoJava;

public class Civic extends Carro{
    public void acelerar () {
        velocidadeAtual += 10;
        if (velocidadeAtual >= 200){
            System.out.println("Reduza a velocidade!");
        }  if (velocidadeAtual >= 250) {
            System.out.println("Voce bateu! e morreu...");

        }
    }

    public void freiar () {
        if (velocidadeAtual <= 0){
            System.out.println("O carro esta parado!!");
        } else if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
    }

    public String toString() {
        return "Civic, voce esta a " +  velocidadeAtual + "Km/h";
    }
}
