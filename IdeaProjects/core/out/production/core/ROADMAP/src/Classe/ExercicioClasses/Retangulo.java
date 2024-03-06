package Classe.ExercicioClasses;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea(){
       return  (largura * altura);
    }
    public double calcularPerimetro(){
        return (largura * altura) * 2;
    }

}
