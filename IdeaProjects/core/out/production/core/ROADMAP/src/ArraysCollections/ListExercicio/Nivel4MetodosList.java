package ArraysCollections.ListExercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Nivel4MetodosList {

    private static String filme;
    static ArrayList<String> pistas = new ArrayList<>();

    public static void LerPistas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        filme = scanner.nextLine().trim().toLowerCase();

        System.out.print("Digite a quantidade de pistas: ");
        int qntPistas = scanner.nextInt();

        // resolve o bug no nextInt()^
        scanner.nextLine();

        for (int i = 0; i < qntPistas; i++) {
            System.out.print("Jogador N1 - Digite a pista " + (i + 1) + ": ");

           String pista = scanner.nextLine();
           pistas.add(pista);
        }
    }
    public static void apresentaPista() {
        ArrayList<Integer> pontuacoes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        pontuacoes = gerarPontuacao(pistas.size());

        for (int i = 0; i < pistas.size(); i++) {

            System.out.println("Pista " + (i + 1) + " = " + pistas.get(i));
            System.out.println("Essa dica vale: " + pontuacoes.get(i) + " pontos");
            System.out.print("\nDigite o nome do filme: ");
            String respostaJogo = scanner.nextLine().toLowerCase().trim();
            if (compararFilme(filme, respostaJogo)){
                System.out.println("Você acertou!");
                System.out.println(pontuacoes.get(i));
                break;
            }
        }
    }
    public static boolean compararFilme(String filme, String respostaJogo) {
        return filme.equalsIgnoreCase(respostaJogo);
    }
    public static ArrayList<Integer> gerarPontuacao(int qntPista){
        int pontuacaoTotal = qntPista * 20;
        ArrayList<Integer> pontuacoes = new ArrayList<>();
        for (int i = 0; i < qntPista; i++) {
            pontuacoes.add(pontuacaoTotal - (i * 20));
        }
        return pontuacoes;
    }
}

