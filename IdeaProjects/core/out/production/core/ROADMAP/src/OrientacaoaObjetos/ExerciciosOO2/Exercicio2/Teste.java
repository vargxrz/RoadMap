package OrientacaoaObjetos.ExerciciosOO2.Exercicio2;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio2.Ponto2D;

public class Teste {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ponto2D ponto2D = new Ponto2D(10, 2);
        Ponto2D ponto2D1 = new Ponto2D(3, 2);
        Ponto2D ponto2D2 = ponto2D.clone();
        Ponto2D pontoIgual = ponto2D;



            System.out.println(ponto2D);
            System.out.println(pontoIgual);
        ponto2D.calcularDistancia(ponto2D1);
        ponto2D.movimentar(3, 6);

        try {
            ponto2D2.comparar(ponto2D1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

