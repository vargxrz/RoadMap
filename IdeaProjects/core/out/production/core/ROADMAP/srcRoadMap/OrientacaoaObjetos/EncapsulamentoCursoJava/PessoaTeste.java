package OrientacaoaObjetos.EncapsulamentoCursoJava;

public class PessoaTeste {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa(17, "Joao");
        p1.setIdade(18); // alterando idade

        System.out.println(p1); //tostring

    }
}

