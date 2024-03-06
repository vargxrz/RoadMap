package OrientacaoaObjetos.ExerciciosOO.Exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcControle {

    Scanner scanner;
    List<CalcDados> historico;

    public CalcControle() {
        this.historico = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void executar() {
        CalcDados calcDados = new CalcDados();
        System.out.println("Digite o primeiro numero: ");
        calcDados.setPrimeiroNumero(scanner.nextDouble());
        System.out.println("Qual operacao voce deseja usar? ");
        calcDados.setOperacao(scanner.next().charAt(0));



        while (calcDados.getOperacao() != 's') {

            System.out.println("Digite o segundo numero: ");
            calcDados.setSegundoNumero(scanner.nextDouble());

            double resultado = calcular(calcDados.getPrimeiroNumero(), calcDados.getSegundoNumero(), calcDados.getOperacao());
            calcDados.setResultado(resultado);
            System.out.println(calcDados.getResultado());
            historico.add(calcDados);
            calcDados = new CalcDados();
            
            calcDados.setPrimeiroNumero(resultado);
            System.out.println("Qual operacao voce deseja usar? ");
            calcDados.setOperacao(scanner.next().charAt(0));

        }
    }
    private double calcular(double primeiroNumero, double segundoNumero, char operacao) {
        double resultado = 0;
        if (operacao == '+') {
            resultado = primeiroNumero + segundoNumero;
        } else if (operacao == '-') {
            resultado = primeiroNumero - segundoNumero;
        } else if (operacao == '*') {
            resultado = primeiroNumero * segundoNumero;
        } else if (operacao == '/') {
            resultado = primeiroNumero / segundoNumero;
        } else {
            System.out.println("Operacao invalida");
        }

        return resultado;
    }
    public void apresentarHistorico() {
        System.out.println(historico.toString());
    }
}