package OrientacaoaObjetos.ExerciciosOO2.Exercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String nome = "";

        Pessoa pessoa = new Pessoa(nome);
        Pessoa pessoa1 = new Pessoa(nome);

        try {
            System.out.println("Digite um primeiro nome: ");
            nome = scanner.next();
            pessoa.setNome(nome);
            System.out.println("Digite o segundo nome: ");
            nome = scanner.next();
            pessoa1.setNome(nome);
            System.out.println(pessoa + " é igual a " + pessoa1 + " ? " + pessoa.verificarIgualdade(pessoa1));
            System.out.println(pessoa + "é irmao de " + pessoa1 + "  ? " + pessoa.verificarIrmaos(pessoa1));
        } catch (DiferenteDeNomeException e) {
            System.out.println(e.getMessage());
        }
    }
}
