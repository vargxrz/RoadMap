package OrientacaoaObjetos.ExerciciosOO.Exercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private int idade;

    private String nome;

    private LocalDate nascimento;

    private String universidade;

    private Departamento departamento;


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

    public void informarNomeUniversidade(String universidade) {
        this.universidade = universidade;
    }
    public void associarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

