package Classe.ExercicioClasses;

public class Circulo {

   private double raio;
   private static final double PI = 3.1415;

    public Circulo(double raioInicial){
        this.raio = raioInicial;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);


    }
}
