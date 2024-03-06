package ArraysCollections.CursoArray;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qauntos alunos? ");
        int numeroAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int notaAlunos = scanner.nextInt();

        double[][] notasDaTurma = new double[numeroAlunos][notaAlunos]; //matriz[][]

        double total = 0;
        for (int i = 0; i < notasDaTurma.length ; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
            System.out.println("Informe a nota " + (i + 1) + " do aluno " + (i + 1) + ": ");
            notasDaTurma[i][j] = scanner.nextInt();
            total += notasDaTurma[i][j];
            }
        }
        double media = total / (numeroAlunos * notaAlunos);
        System.out.println("A media da turma é " + media);

        }
    }


