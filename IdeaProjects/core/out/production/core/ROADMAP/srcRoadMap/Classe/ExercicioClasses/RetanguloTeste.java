package Classe.ExercicioClasses;

public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(100,200);
        System.out.println("A area do retangulo é de: " + retangulo.calcularArea());
        System.out.println("O perimetro do retangulo é de: " + retangulo.calcularPerimetro());

    }
}
