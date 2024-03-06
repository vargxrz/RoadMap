import java.util.Random;
import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        IntegrationApi integrationApi = new IntegrationApi();
        int opcao;

        System.out.print("Deseja iniciar um novo jogo ?\n1 - Iniciar\n2 - Sair\nDigite sua escolha: ");
        opcao = scanner.nextInt();

        while (opcao != 2) {
            int numeroRandom = random.nextInt(1, 403);
             Pokemon pokemon = integrationApi.getPokemon(numeroRandom);
              Jogo jogo = new Jogo(pokemon);

            try {
                while (!jogo.getGanhou()) {
                    System.out.print("Digite o nome de um pokemon: ");
                    String nome = scanner.next();
                    jogo.verificarNome(nome);
                    System.out.println(jogo);
                }
            } catch (PerdeuException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\nDeseja iniciar um novo jogo ?\n1 - Iniciar\n2 - Sair\nDigite sua escolha:");
            opcao = scanner.nextInt();
        }
    }
}