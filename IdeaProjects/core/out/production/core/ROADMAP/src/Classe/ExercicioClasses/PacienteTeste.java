package Classe.ExercicioClasses;

import java.util.List;

public class PacienteTeste {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Joao", 17);

        PacienteConsulta consulta1 = new PacienteConsulta("Exame Hemograma");
        PacienteConsulta consulta2 = new PacienteConsulta("Exame de Colesterol");
        PacienteConsulta consulta3 = new PacienteConsulta("Exame de sangue");
        PacienteConsulta consulta4 = new PacienteConsulta("Exame de urina");
        PacienteConsulta consulta5 = new PacienteConsulta("Exame de prostata");

        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);
        paciente.adicionarConsulta(consulta3);
        paciente.adicionarConsulta(consulta4);
        paciente.adicionarConsulta(consulta5);

        System.out.println(paciente.nome + ", " + paciente.idade + " anos");
        System.out.println(paciente.consultas.toString());

    }

}
