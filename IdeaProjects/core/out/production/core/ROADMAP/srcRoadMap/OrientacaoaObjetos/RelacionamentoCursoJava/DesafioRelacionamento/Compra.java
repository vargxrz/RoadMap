package OrientacaoaObjetos.RelacionamentoCursoJava.DesafioRelacionamento;


import java.util.ArrayList;
import java.util.List;

public class Compra {

   final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qntd) {
        this.itens.add(new Item(p, qntd));
    }
    void adicionarItem(String nome, double preco, int qntd) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qntd));
    }
    double obterValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
