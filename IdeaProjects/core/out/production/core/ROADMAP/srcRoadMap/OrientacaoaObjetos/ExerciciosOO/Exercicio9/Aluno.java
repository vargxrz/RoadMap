package OrientacaoaObjetos.ExerciciosOO.Exercicio9;

public class Aluno extends Pessoa{

    String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public Aluno(){
    }
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Curso do Aluno: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
