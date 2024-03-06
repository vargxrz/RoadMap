package Classe.ExercicioClasses;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    int matricula;
    List<Double> notas;
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<Double>();
    }
    public double calcularMedia(){
        double totalNotas = 0;
        for (int i = 0; i < notas.size(); i++) {
            totalNotas += notas.get(i);
        }
        return totalNotas / notas.size();
    }

    public void adicionarNota(double nota){
        notas.add(nota);
    }
}


