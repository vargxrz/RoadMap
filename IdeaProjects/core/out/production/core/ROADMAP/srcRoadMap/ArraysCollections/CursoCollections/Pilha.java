package ArraysCollections.CursoCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        //adiciona
        livros.add("O pequeno principe");
        livros.push("Romeu e Julieta");

        //pega o ultino elemento
        System.out.println(livros.peek());
        System.out.println(livros.element());

        //remove
        System.out.println(livros.poll());
        System.out.println(livros.remove());


//        livros.size();
//        livros.clear();
//        livros.contains();

        for (String livro: livros){
            System.out.println(livro);
        }
    }
}
