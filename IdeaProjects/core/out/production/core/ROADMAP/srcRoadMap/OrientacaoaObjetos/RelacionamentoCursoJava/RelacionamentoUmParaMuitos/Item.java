package OrientacaoaObjetos.RelacionamentoCursoJava.RelacionamentoUmParaMuitos;

public class Item {

    String nome;
    int quatidade;
    double preco;
    Compra compra;

    Item(String nome, int quatidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }
}
