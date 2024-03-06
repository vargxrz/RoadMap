package OrientacaoaObjetos.ExerciciosOO2.Exercicio5;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio2.Ponto2D;

import java.util.Scanner;

public class Teste {
    private static Scanner scanner;
    public static void main(String[] args) throws ValorNegativoException {
        int desinflarRaio;
        int inflarRaio;
        scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Ponto2D ponto2D = new Ponto2D();

        System.out.println("Raio do circulo " + circulo.getRaio());
        System.out.println("Area do circulo " + circulo.calcularArea());

        try {
            System.out.println("Digite a quantidade que deseja inflar o raio do circulo:");
            inflarRaio = scanner.nextInt();
            circulo.inflar(inflarRaio);
            System.out.println("Digite a quantidade que deseja inflar o raio do circulo:");
            desinflarRaio = scanner.nextInt();
            circulo.desinflar(desinflarRaio);
            circulo.mover(3, -3);
            System.out.println("Raio do circulo " + circulo.getRaio());
            System.out.println("Area do circulo " + circulo.calcularArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
