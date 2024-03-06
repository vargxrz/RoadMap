package OrientacaoaObjetos.ExerciciosOO2.Exercicio5;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio2.Ponto2D;
import com.sun.source.doctree.EscapeTree;

import java.awt.geom.Point2D;

public class Circulo {
    double raio;
     Ponto2D ponto2D;
    static final double PI = 3.14;

    public Circulo(double raio, Ponto2D ponto2D) {
        this.raio = raio;
        this.ponto2D = ponto2D;
    }
    public Circulo() {
        ponto2D = new Ponto2D(0, 0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void inflar(double valor) throws ValorNegativoException{
        if (valor >= 0) {
            raio += valor;
        } else  {
            throw new ValorNegativoException("Somente valores positivos!");
        }
    }
    public void desinflar(double valor) throws ValorNegativoException{
        if (valor >= 0) {
            raio -= valor;
        } else  {
            throw new ValorNegativoException("Somente valores positivos!");
        }
    }
    public void inflar() {
        raio++;
    }
    public void desinflar() {
        raio--;
    }
    public void mover() {
        ponto2D.movimentar(0, 0);
    }
    public void mover(double x, double y) {
            ponto2D.movimentar((int) x, (int) y);
    }
    public void mover(Ponto2D ponto2D) {
        ponto2D.setX(ponto2D.getX());
        ponto2D.setY(ponto2D.getY());
    }
    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }
}
