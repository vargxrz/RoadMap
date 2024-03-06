package OrientacaoaObjetos.ExerciciosOO.Exercicio4;

import java.time.LocalDate;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(LocalDate.of(1879, 3, 14), "Albert Einstein");
        Pessoa p2 = new Pessoa(LocalDate.of(1643, 1, 4), "Isaac Newton");


        Universidade universidade1 = new Universidade("Oxford");
        Universidade universidade2 = new Universidade("Princeton");

        Departamento departamento1 = new Departamento("Fisica");
        Departamento departamento2 = new Departamento("Quimica");
        Departamento departamento3 = new Departamento("Tecnologia");
        Departamento departamento4 = new Departamento("Quimica");


        departamento1.setUniversidade(universidade1);
        departamento3.setUniversidade(universidade1);
        departamento4.setUniversidade(universidade1);

        p1.associarDepartamento(departamento1);
        p2.associarDepartamento(departamento2);

        p1.informarNomeUniversidade("Furb");
        p2.informarNomeUniversidade("Furb");

        p1.setDepartamento(departamento1);
        p2.setDepartamento(departamento2);

        universidade1.adicionarDepartamento(departamento1);
        universidade1.adicionarDepartamento(departamento3);
        universidade1.adicionarDepartamento(departamento4);

        p1.calculaIdade(LocalDate.now());
        System.out.println("Albert Eistein teria " + p1.informarIdade(p1.getIdade()) + " anos em " + LocalDate.now());

        p2.calculaIdade(LocalDate.now());
        System.out.println("Isaac Newton teria " + p2.informarIdade(p2.getIdade()) + " anos em " + LocalDate.now());

        System.out.println(p1.getNome() + " estudou no " + p1.getUniversidade());
        System.out.println(p2.getNome() + " estudou no " + p2.getUniversidade());

        departamento1.setUniversidade(universidade1);
        departamento2.setUniversidade(universidade2);

        System.out.println(p1.getNome() + " trabalhou em " + p1.getDepartamento());
        System.out.println(p2.getNome() + " trabalhou em " + p2.getDepartamento());

        System.out.println(universidade1.getDepartamentos());


        for (int i = 1; i <= 50; i++) {
            String txt = Integer.toString(i);
            universidade1.adicionarDepartamento(new Departamento(txt));
        }
    }
}
