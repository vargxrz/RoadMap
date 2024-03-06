package Classe.ExercicioClasses;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Joao", 12345);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1- Digite uma nota. \n2- Sair \nEscolha uma opção:");
        int opcao = scanner.nextInt();
        while (opcao != 2) {
            System.out.println("Informe uma nota: ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(nota);
            System.out.println("\n1- Digite uma nota. \n2- Sair \nEscolha uma opção:");
            opcao = scanner.nextInt();

        }
        double mediaDoAluno = aluno.calcularMedia();
        System.out.println(mediaDoAluno);
        if (mediaDoAluno <= 6){
            System.out.println("Voce esta reprovado!!");
        } else {
            System.out.println("Voce esta aprovado!!");
        }
    }
}
