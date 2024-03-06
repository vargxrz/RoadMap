package OrientacaoaObjetos.ExerciciosOO.Exercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    int idade;

    String nome;

    LocalDate nascimento;

    public void calculaIdade(LocalDate dataAtual) {
        this.idade = (int) ChronoUnit.YEARS.between(this.nascimento, dataAtual);
    }
    public int informarIdade(int idade) {
        return idade;
    }
    public String informarNome(String nome) {
        return nome;
    }

    public Pessoa(LocalDate nascimento, String nome) {
        this.nascimento = nascimento;
    }
}
