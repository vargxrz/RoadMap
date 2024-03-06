package OrientacaoaObjetos.ExerciciosOO2.Exercicio6;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio7.Continente;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Teste{
    private static Scanner scanner;
    public static void main(String[] args) throws ValoresContrariosException {
        scanner = new Scanner(System.in);

        List<Pais> fronteirasPais = new ArrayList<>();

        String codigoIso = "";
        String nome = "";
        long dimensao = 0;
        long populacao = 0;

        Pais pais = new Pais(populacao, codigoIso, nome, dimensao);
        Pais pais2 = new Pais(populacao,codigoIso, nome, dimensao);
        fronteirasPais.add(new Pais(5154, "4457-4", "Chile", 45645));

        try {
            System.out.println("Digite o nome de um pais 1: ");
            nome = scanner.next();
            pais.setNome(nome);
            System.out.println("Digite o codigo Iso do pais 1: ");
            codigoIso = scanner.next().toLowerCase();
            pais.setCodigoIso(codigoIso);
            System.out.println("Digite a populaçao do pais 1: ");
            populacao = scanner.nextLong();
            pais.setPopulacao(populacao);
            System.out.println("Digite a dimensao do pais 1: ");
            dimensao = scanner.nextLong();
            pais.setDimensao(dimensao);

            System.out.println(pais.getNome());
            System.out.println(pais.getCodigoIso());
            System.out.println(pais.getPopulacao());
            System.out.println(pais.getDimensao());
            System.out.println("Densidade do " + pais.getNome() + ": " +pais.densidade());

        } catch (ValoresContrariosException e) {
            System.out.println(e.getMessage());
        }

        Continente continente = new Continente("Asia");
        continente.adicionarPaises(pais);
        continente.adicionarPaises(pais2);
    }
}
