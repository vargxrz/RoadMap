package Classe.ExercicioClasses;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    boolean disponivel;
    public Livro(String titulo, String autor, int numeroPaginas){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }
    public boolean estaDisponivel() {
        return disponivel;
    }
    public boolean emprestar(){
    disponivel = false;
        return disponivel;
    }
    public boolean devolver(){
        disponivel = true;
        return disponivel;
    }


}


