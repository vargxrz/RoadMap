package Classe.ExercicioClasses;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {

        String txt;
        Livro livro = new Livro("Romeu e Julieta", "Shakespeare", 160);

        Scanner scanner = new Scanner(System.in);
        System.out.print(livro.titulo + " de " + livro.autor + "\n1 - Pegar emprestado\n2 - Devolver\n3 - Sair\nDigite sua escolha: ");
        int opcao = scanner.nextInt();

        while (opcao != 3) {

            if (opcao == 1) {
                if (livro.estaDisponivel()) {
                    livro.emprestar();
                    System.out.println("Disponivel, Devolva em 7 dias!");
                } else {
                    System.out.println("Indisponivel, tente novamente em alguns dias!");
                }
            }

            else if (opcao == 2) {
                if (livro.estaDisponivel() == false) {
                    livro.devolver();
                    System.out.println("Obrigado, volte sempre!!");
                }else {
                    System.out.println("O livro ja foi devolvido!!");
                }
            }
            System.out.println(livro.titulo + " de " + livro.autor + "\n1 - Pegar emprestado\n2 - Devolver\n3 - Sair\nDigite sua escolha: ");
            opcao = scanner.nextInt();
        }
    }
}

