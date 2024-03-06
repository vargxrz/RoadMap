package Classe.ExemplosClasseDoCurso;

public class Produto {
    String nome;
    double preco;
   static double desconto = 0.50;

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;

    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}

