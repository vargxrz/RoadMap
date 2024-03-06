package OrientacaoaObjetos.ExerciciosOO2.Exercicio8;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Pessoa {
    String nome;
    Pessoa mae;
    Pessoa pai;
    Pessoa irmao;

    public Pessoa(String nome, Pessoa mae, Pessoa pai, Pessoa irmao) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.irmao = irmao;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws DiferenteDeNomeException{
        if (Pattern.matches("[a-zA-Z]+", nome)) {
            this.nome = nome;
        } else {
            throw new DiferenteDeNomeException("Voce digitou um nome invalido!");
        }
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public boolean verificarIgualdade(Pessoa pessoa) {
        return this.nome.equals(pessoa.getNome()) && Objects.equals(mae, pessoa.getMae()) && Objects.equals(pai, pessoa.getPai());
    }

    public boolean verificarIrmaos(Pessoa pessoa) {
        return Objects.equals(mae, pessoa.getMae()) && Objects.equals(pai, getPai());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae) && Objects.equals(pai, pessoa.pai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mae, pai);
    }

    private boolean isAntepassado(Pessoa pessoa) {
        return match(pai, pessoa) || match(mae, pessoa);
    }

    private boolean match(Pessoa familiar, Pessoa busca) {
        if (familiar != null) {
            return familiar.equals(busca) || match(familiar.mae, busca) || match(familiar.pai, busca);
        }
        return false;
    }

    public boolean ehIrmao(Pessoa pessoa) {
        return verificarIrmao(pai, pessoa) || verificarIrmao(mae, pessoa);
    }

    public boolean verificarIrmao(Pessoa irmao, Pessoa busca) {
        if (irmao != null) {
            return irmao.equals(busca) ||verificarIrmao(irmao.mae, busca) || verificarIrmao(irmao.pai, busca);
        }
        return false;
    }
}
