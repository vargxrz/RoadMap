package OrientacaoaObjetos.ExerciciosOO.Exercicio9;

import java.util.Scanner;

public class ClasseTeste {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Voce deseja inserir uma pessoa ou um aluno?\nDigite sair para encerrar\nDigite sua escolha: ");
        String escolha = scanner.next();
        alunoOuPessoa(escolha);
    }

    public static void alunoOuPessoa(String escolha){
        Pessoa pessoa = null;
        while (!escolha.equalsIgnoreCase("sair")) {
            if (escolha.equalsIgnoreCase("pessoa")) {
                pessoa = new Pessoa();
                perguntarPessoa(pessoa);
                pessoa.mostraDados();
            }
            else if (escolha.equalsIgnoreCase("aluno")) {
                pessoa = new Aluno();
                perguntarAluno((Aluno) pessoa);
                pessoa.mostraDados();
            } else {
                System.out.println("opcao invalida!");
            }
            System.out.println("Voce deseja inserir uma pessoa ou um aluno?\nDigite sua escolha: ");
            escolha = scanner.next();
        }
    }
    public static void perguntarAluno(Aluno aluno) {
        perguntarPessoa(aluno);
        System.out.println("Digite um curso: ");
        aluno.curso = scanner.next();
        aluno.setCurso(aluno.curso);
    }

    public static void perguntarPessoa(Pessoa pessoa) {
        System.out.println("Digite um nome: ");
        pessoa.nome = scanner.next();
        pessoa.setNome(pessoa.nome);
        System.out.println("Digite uma idade: ");
        pessoa.idade = scanner.nextInt();
        pessoa.setIdade(pessoa.idade);
    }


}
