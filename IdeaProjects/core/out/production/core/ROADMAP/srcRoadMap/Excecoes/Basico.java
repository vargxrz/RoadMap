package Excecoes;

import OrientacaoaObjetos.ExerciciosOO.Exercicio9.Aluno;

public class Basico {
    public static void main(String[] args) {

        Aluno aluno = null;

        try {
            imprimirNomeDoAluno(aluno);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario!");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }

        System.out.println("Fim :)");
    }
    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
