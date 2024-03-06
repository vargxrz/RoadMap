package OrientacaoaObjetos.ExerciciosOO.Exercicio2;

import OrientacaoaObjetos.ExerciciosOO.Exercicio2.Pessoa;

import java.time.LocalDate;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(LocalDate.of(1879, 3, 14), "Albert Einstein");
        Pessoa p2 = new Pessoa(LocalDate.of(1643, 1, 4), "Isaac Newton");

        p1.calculaIdade(LocalDate.now());
        System.out.println("Albert Eistein teria " + p1.informarIdade(p1.idade) + " anos em " + LocalDate.now());

        p2.calculaIdade(LocalDate.now());
        System.out.println("Isaac Newton teria " + p2.informarIdade(p2.idade) + " anos em " + LocalDate.now());
    }
}