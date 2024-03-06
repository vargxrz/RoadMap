package OrientacaoaObjetos.ExerciciosOO.Exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        double nota = 0;
        Aluno aluno = null;
        List<Aluno> alunoList = new ArrayList<>();
        System.out.print("Nome do aluno: ");
        nome = scanner.nextLine();

        while (!nome.equalsIgnoreCase("fim")) {
            aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Digite a primeira nota: ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 100) {
                    aluno.setPrimeiraNotalParcial(nota);
                } else {
                    scanner.nextLine();
                    continue;
                }
            } else {
                scanner.nextLine();
                continue;
            }
            System.out.println("Digite a segunda nota: ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 100) {
                    aluno.setSegundaNotalParcial(nota);
                } else {
                    scanner.nextLine();
                    continue;
                }
            } else {
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            alunoList.add(aluno);
            aluno.getMedia();
            System.out.print("Nome do aluno:");
            nome = scanner.nextLine();
        }
        for (int i = 0; i < alunoList.size(); i++) {
            perguntarAluno(alunoList.get(i));
            verificarMedia(alunoList,i);
        }
        getContagemMedia();
    }
    static int contagemAprovado = 0;
    static int contagemExame = 0;
    static int contagemReprovado = 0;
    public static void verificarMedia(List<Aluno> alunoList, int i) {

        if (alunoList.get(i).getMedia() >= 70) {
            contagemAprovado++;
            alunoList.get(i).getMedia();       }
        else if (alunoList.get(i).getMedia() >= 40 && alunoList.get(i).getMedia() < 70) {
            contagemExame++;
            alunoList.get(i).getMedia();
        }
        else {
            contagemReprovado++;
            alunoList.get(i).getMedia();
        }
    }
    public static void getContagemMedia() {
        System.out.println("Aprovados: " + contagemAprovado);
        System.out.println("Em exames: " + contagemExame);
        System.out.println("Reprovados: " + contagemReprovado);
    }
    public static void perguntarAluno(Aluno aluno) {
        System.out.println("Nome aluno: " + aluno.getNome() + "\nPrimeira nota: " + aluno.getPrimeiraNotalParcial() +
                "\nSegunda nota: " + aluno.getSegundaNotalParcial()+ "\n");
    }
}
