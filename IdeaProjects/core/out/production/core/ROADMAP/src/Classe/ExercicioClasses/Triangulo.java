package Classe.ExercicioClasses;

public class Triangulo {

    int lado1;
    int lado2;
    int lado3;

    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area(){
        return (1.732 * (lado1 * lado1)) / 4;
    }

    public boolean valido(){
        return lado1 == lado2 && lado2 == lado3;

    }
    public String toString(){
        String txtTriangulo;
        if (valido()){
            txtTriangulo = "Triangulo Valido!";
        }
        else {
            txtTriangulo = "Triangulo Invalido!";
        }
        return txtTriangulo + " A area do triangulo é: " + area();
    }
}
