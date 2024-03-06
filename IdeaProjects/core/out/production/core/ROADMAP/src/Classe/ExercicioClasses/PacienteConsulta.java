package Classe.ExercicioClasses;

import org.w3c.dom.CDATASection;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PacienteConsulta {

    String consulta;
    LocalDate data;

    public PacienteConsulta(String consulta) {
        this.consulta = consulta;
        this.data = LocalDate.now();


    }


    public String toString() {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String text = data.format(formatters);
        return consulta + " foi feito no dia " + text +"\n";
    }
}