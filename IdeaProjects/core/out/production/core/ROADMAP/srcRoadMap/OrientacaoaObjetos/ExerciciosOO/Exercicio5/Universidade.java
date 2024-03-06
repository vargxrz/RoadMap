package OrientacaoaObjetos.ExerciciosOO.Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        departamentos = new ArrayList<>();
    }
    public void adicionarDepartamento(Departamento departamento) {
        if(departamentos.size() >= 50) {
            return;
        }
        for (int i = 0; i < departamentos.size(); i++) {
            if(departamentos.get(i).getNome().equals(departamento.getNome())){
                System.out.println("Departamento já existe");
                return;
            }
        }
        departamentos.add(departamento);
    }
    public void informarNome(String nome) {
        this.nome = nome;
    }
    public String retornarNome() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
