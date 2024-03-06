package Classe.ExercicioClasses;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Maminha", 80.30, 4);
        Produto produto2 = new Produto("File Mignon", 149.99, 2);
        Produto produto3 = new Produto("Linguiça", 34.99, 3);
        Produto produto4 = new Produto("Acém", 60.00, 0);
        Produto produto5 = new Produto("Picanha", 142.20, 2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos.toString());
    }
}
