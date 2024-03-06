package OrientacaoaObjetos.RelacionamentoCursoJava.RelacionamentoUmParaMuitos;

public class CompraTeste {
    public static void main(String[] args) {


    Compra compra1 = new Compra();
    compra1.cliente = "Joao Gabriel";
    compra1.adicionarItem(new Item("Caneta", 20, 7.45));
    compra1.adicionarItem(new Item("Lapis", 12, 4.99));
    compra1.adicionarItem(new Item("Borracha", 4, 2.49));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

      double total = compra1.itens.getFirst().compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total é de " + total);
    }
}
