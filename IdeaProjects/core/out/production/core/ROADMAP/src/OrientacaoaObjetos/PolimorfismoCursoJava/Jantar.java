package OrientacaoaObjetos.PolimorfismoCursoJava;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediete1 = new Arroz(0.2);
        Arroz ingrediete2 = new Arroz(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediete1);
        convidado.comer(ingrediete2);
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
