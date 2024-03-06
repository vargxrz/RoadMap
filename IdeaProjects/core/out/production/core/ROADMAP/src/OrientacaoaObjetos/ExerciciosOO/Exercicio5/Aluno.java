package OrientacaoaObjetos.ExerciciosOO.Exercicio5;

public class Aluno {

    private double primeiraNotalParcial;
    private double segundaNotalParcial;
    private String nome;

    public double getPrimeiraNotalParcial() {
        return primeiraNotalParcial;
    }
    public void setPrimeiraNotalParcial(double primeiraNotalParcial) {
        if (primeiraNotalParcial >= 0 && primeiraNotalParcial <= 100) {
            this.primeiraNotalParcial = primeiraNotalParcial;
        }else{
            System.out.println("Nota inválida.");
        }
    }
    public double getSegundaNotalParcial() {
        return segundaNotalParcial;
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
}
    public void setSegundaNotalParcial(double segundaNotalParcial) {
        if (segundaNotalParcial >= 0 && segundaNotalParcial <= 100) {
            this.segundaNotalParcial = segundaNotalParcial;
        } else {
            System.out.println("Nota inválida.");
        }
    }
    public double getMedia() {
        double media = (getPrimeiraNotalParcial() + getSegundaNotalParcial()) / 2;
       return media;
    }
}
