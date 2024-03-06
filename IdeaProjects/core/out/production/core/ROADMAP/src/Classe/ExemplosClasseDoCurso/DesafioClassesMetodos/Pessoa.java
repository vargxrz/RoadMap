package Classe.ExemplosClasseDoCurso.DesafioClassesMetodos;

public class Pessoa {


    String nome;
    double peso;

    public Pessoa(String nome, double peso){

        this.nome = nome;
        this.peso = peso;
    }
    public double comer(Comida comida){// Método 'comer' da classe Pessoa, que recebe uma instância de Comida como argumento

        return peso += comida.pesoDaComida; // Aumenta o peso da pessoa ao comer a comida
    }
}
