package OrientacaoaObjetos.ExerciciosOO2.Exercicio3;

import java.util.Scanner;

public class NumeroComplexo {

    double parteInteira;
    double parteImaginaria;

    public NumeroComplexo(){
    }

    public double getParteInteira() {
        return parteInteira;
    }

    public void setParteInteira(double parteInteira) throws NumeroNegativoException{
        if (parteInteira < 0){
            throw new NumeroNegativoException("Permitido apenas números positivos");
        }

        this.parteInteira = parteInteira;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public void somar(NumeroComplexo numeroComplexo) {
        this.parteInteira += numeroComplexo.getParteInteira();
        this.parteImaginaria += numeroComplexo.getParteImaginaria();
    }
    public void subtrair(NumeroComplexo numeroComplexo) {
        this.parteInteira -= numeroComplexo.getParteInteira();
        this.parteImaginaria -= numeroComplexo.getParteImaginaria();
    }
    public void multiplicar(NumeroComplexo numeroComplexo) {
        this.parteInteira = ((this.parteInteira * numeroComplexo.getParteInteira()) - (this.parteImaginaria * numeroComplexo.getParteImaginaria()));
        this.parteImaginaria = ((this.parteImaginaria * numeroComplexo.getParteInteira()) + (this.parteInteira * numeroComplexo.getParteImaginaria()));
    }
    public void dividir(NumeroComplexo numeroComplexo) throws DivisaoPorZeroException {
       double divisaoPorZero = (Math.pow(numeroComplexo.getParteInteira(), 2) + Math.pow(numeroComplexo.getParteImaginaria(), 2));
        if (divisaoPorZero != 0) {
            this.parteInteira = ((this.parteInteira * numeroComplexo.getParteInteira()) + (this.parteImaginaria * numeroComplexo.getParteImaginaria()) / (Math.pow(numeroComplexo.getParteInteira(), 2) + Math.pow(numeroComplexo.getParteImaginaria(), 2)));
            this.parteImaginaria = ((this.parteImaginaria * numeroComplexo.getParteInteira()) - (this.parteInteira * numeroComplexo.getParteImaginaria()) / (Math.pow(numeroComplexo.getParteInteira(), 2) + Math.pow(numeroComplexo.getParteImaginaria(), 2)));
        } else {
            throw new DivisaoPorZeroException("Nao é possivel fazer divisao por zero!");
        }
    }
    public boolean comparacao(NumeroComplexo numeroComplexo) {
        return this.parteInteira == numeroComplexo.getParteInteira() && this.parteImaginaria == numeroComplexo.getParteImaginaria();
    }

    @Override
    public String toString() {
        return parteInteira + " = Re (Z), " + parteImaginaria + " = Im (Z)";
    }
    public double retornarModulo(){
        return parteInteira + parteImaginaria;
    }
}
