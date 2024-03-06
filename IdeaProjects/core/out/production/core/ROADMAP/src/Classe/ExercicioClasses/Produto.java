package Classe.ExercicioClasses;

public class Produto {

    String nome;
    double preco;
    double quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean estoqueDisponivel() {
       return quantidade > 0;
    }
    public double valorTotal(){
        return quantidade * preco;
    }

    public String toString(){
        String txtDisponibilidade = "";

        if (estoqueDisponivel()){
            txtDisponibilidade = "disponivel";
        }else {
            txtDisponibilidade = "indisponível";
        }

        return " O produto " + nome + " tem " + quantidade + " quantidades, o preço do kg esta R$" +  preco + " e valor total de " +
                "todas as quantidades é R$" + valorTotal() + ", este produto está " +  txtDisponibilidade + " para compra.\n";
    }
}
