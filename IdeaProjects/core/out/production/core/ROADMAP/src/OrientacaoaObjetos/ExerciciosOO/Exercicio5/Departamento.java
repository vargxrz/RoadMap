package OrientacaoaObjetos.ExerciciosOO.Exercicio5;

public class Departamento {
    String nome;

    Universidade universidade;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString (){
        return "Departamento: " + nome + " associado a universidade " +
                (universidade != null ? universidade.retornarNome() : " sem universidade");
    }

}
