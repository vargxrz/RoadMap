package ArraysCollections.ArraysExercicio;

import java.util.Scanner;

public class Nivel4MetodosArray {

    static String filme;
    static String[] pistas;

    public static void LerPistas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        filme = scanner.nextLine().toLowerCase().trim();;

        System.out.print("Digite a quantidade de pistas: ");
        int qntPistas = scanner.nextInt();
        scanner.nextLine();
        pistas = new String[qntPistas];

        for (int i = 0; i < qntPistas; i++) {
            System.out.print("Jogador N1 - Digite a pista " + (i + 1) + ": ");

            String pista;
            pista = scanner.nextLine();
            pistas[i] = pista;
        }


        System.out.println("\f");
    }
    public static void apresentaPista() {
        Scanner scanner = new Scanner(System.in);
        int[] pontuacoes = gerarPontuacao(pistas.length);

        for (int i = 0; i < pistas.length; i++) {

            System.out.println("Pista " + (i + 1) + " = " + pistas[i]);
            System.out.println("Essa dica vale: " + pontuacoes[i] + " pontos");
            System.out.print("\nDigite o nome do filme: ");
            String respostaJogo = scanner.nextLine().toLowerCase().trim();
            if (compararFilme(filme, respostaJogo)){
                System.out.println("Você acertou!");
                System.out.println(pontuacoes[i]);
                break;
            }
        }
    }
    public static boolean compararFilme(String filme, String respostaJogo) {
        return filme.equalsIgnoreCase(respostaJogo);
    }
    public static int[] gerarPontuacao(int qntPista){
        int pontuacaoTotal = qntPista * 20;
        int[] pontuacoes = new int[qntPista];
        for (int i = 0; i < pontuacoes.length; i++) {
            pontuacoes[i] = pontuacaoTotal - (i * 20);
        }
        return pontuacoes;
    }
}


