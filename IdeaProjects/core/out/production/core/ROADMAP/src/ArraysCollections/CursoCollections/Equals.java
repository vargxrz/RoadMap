package ArraysCollections.CursoCollections;

public class Equals {
    public static void main(String[] args) {

        EqualsUsuario dados1 = new EqualsUsuario();
        dados1.nome = "Joao Vargas";
        dados1.email = "VargasJoao@gmail.com";

        EqualsUsuario dados2 = new EqualsUsuario();
        dados2.nome = "Joao Vargas";
        dados2.email = "VargasJoao@gmail.com";

        System.out.println(dados1 == dados2);
        System.out.println(dados1.equals(dados2));
        System.out.println(dados2.equals(dados1));

    }
}
