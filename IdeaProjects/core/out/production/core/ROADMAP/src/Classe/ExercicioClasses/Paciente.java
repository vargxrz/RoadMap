package Classe.ExercicioClasses;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    String nome;
    int idade;

    List<PacienteConsulta> consultas;

    public Paciente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(PacienteConsulta consulta){
        consultas.add(consulta);
    }

    }

