package Classe.ExercicioClasses;

public class CirculoTeste {
    public static void main(String[] args) {

        Circulo area = new Circulo(6.0);
        Circulo perimetro = new Circulo(5.0);
        System.out.println("A area do circulo é: " + area.calcularArea());
        System.out.println("O perimetro do circulo é: " + perimetro.calcularPerimetro());

    }
}
