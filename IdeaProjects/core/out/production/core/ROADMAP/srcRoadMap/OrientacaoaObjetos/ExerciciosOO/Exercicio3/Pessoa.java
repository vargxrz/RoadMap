package OrientacaoaObjetos.ExerciciosOO.Exercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    int idade;

    String nome;

    LocalDate nascimento;

    String universidade;

    public void calculaIdade(LocalDate dataAtual) {
        this.idade = (int) ChronoUnit.YEARS.between(this.nascimento, dataAtual);
    }
    public int informarIdade(int idade) {
        return idade;
    }
    public String informarNome(String nome) {
        return nome;
    }
    public void ajustaDataDeNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa(LocalDate nascimento, String nome) {
        this.nascimento = nascimento;
    }
    public void informarNomeUniversidade(String universidade, String nome) {
        this.universidade = universidade;
        this.nome = nome;

    }
}
