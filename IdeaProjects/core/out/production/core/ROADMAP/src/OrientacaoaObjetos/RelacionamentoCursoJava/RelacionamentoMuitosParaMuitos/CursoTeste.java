package OrientacaoaObjetos.RelacionamentoCursoJava.RelacionamentoMuitosParaMuitos;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("AWS Amazon");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);


        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno2);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);

        for (Aluno aluno: curso1.alunos) {
            System.out.print("Estou matriculado no curso " + curso3.nome);
            System.out.print(" e meu nome é " + aluno.nome + "\n");
            System.out.println();
        }
        System.out.println(aluno1.cursos.getFirst().alunos + "\n");

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");

    if (cursoEncontrado != null){
        System.out.println(cursoEncontrado.nome);
        System.out.println(cursoEncontrado.alunos);
    }
    }
}
