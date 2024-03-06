package Classe.ExercicioClasses;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    String nome;
    double salario;
    String cargo;
    List<DescontoFuncionario> descontos;
    public Funcionario(String nome, String cargo, double salario){
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
        this.descontos = new ArrayList<>();
    }

    public double calcularSalarioLiquido() {
        double totalDesconto = 0;
        for (int i = 0; i < descontos.size(); i++) {
            totalDesconto += descontos.get(i).valor;
        }
        salario -= (totalDesconto * salario) / 100;
        return salario;
    }


    public void adicionarDesconto(DescontoFuncionario desconto){
        descontos.add(desconto);
    }

    public String toString(){
        return "Funcionário: "+ nome + "\nCargo: "+ cargo + "\nSalário: "+ salario + "\n"+descreverDescontos();
    }

    public String descreverDescontos(){
        String descontosTxt = "Descontos: ";

        for (int i = 0; i < descontos.size(); i++){
            descontosTxt += "\nTipo: "+descontos.get(i).tipo + "\nValor: "+ descontos.get(i).valor;
        }

        return descontosTxt;
    }
}
