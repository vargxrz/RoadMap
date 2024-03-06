package Excecoes;

public class DivisaoPorZero {
    public static void main(String[] args) {

        try {
            int numero = 10;
            int denominador = 2;
            double resultado = numero / denominador;
            System.out.println("Resultado " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro, nao é possivel dividir por zero!");
        }
    }
}