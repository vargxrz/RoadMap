package OrientacaoaObjetos.ExerciciosOO.Exercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
        int idade;

        String nome;

        LocalDate nascimento;

    public Pessoa(LocalDate nascimento, String nome) {
        this.nascimento = nascimento;
        this.nome = nome;
    }

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
    }
