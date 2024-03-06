package Classe.ExemplosClasseDoCurso;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notbook", 2500);

        var p2 = new Produto("Celular", 1500);

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.print("Media do carrinho = R$" + mediaCarrinho);
    }
}
