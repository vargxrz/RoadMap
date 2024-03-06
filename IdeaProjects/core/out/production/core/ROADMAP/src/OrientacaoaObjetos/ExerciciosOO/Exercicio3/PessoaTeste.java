package OrientacaoaObjetos.ExerciciosOO.Exercicio3;

import java.time.LocalDate;

public class PessoaTeste {
    public static void main(String[] args) {

      Pessoa p1 = new Pessoa(LocalDate.of(1879, 3, 14), "Albert Einstein");
        Pessoa p2 = new Pessoa(LocalDate.of(1643, 1, 4), "Isaac Newton");

        Universidade universidade1 = new Universidade();
        Universidade universidade2 = new Universidade();

        universidade1.informarNome("Oxford");
        universidade2.informarNome("Princeton");

        p1.informarNomeUniversidade("Furb", "Albert Einstein");
        p2.informarNomeUniversidade("Uniavan", "Isaac Newton");

        p1.calculaIdade(LocalDate.now());
        System.out.println("Albert Eistein teria " + p1.informarIdade(p1.idade) + " anos em " + LocalDate.now());

        p2.calculaIdade(LocalDate.now());
        System.out.println("Isaac Newton teria " + p2.informarIdade(p2.idade) + " anos em " + LocalDate.now());

        System.out.println(p1.nome + " estudou em " + p1.universidade);
        System.out.println(p2.nome + " estudou em " + p2.universidade);
    }
}
