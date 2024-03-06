package OrientacaoaObjetos.ExerciciosOO.Exercicio9;

public class Pessoa {

    String nome;
    int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void mostraDados(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
