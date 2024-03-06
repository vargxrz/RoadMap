package Classe.ExemplosClasseDoCurso;

public class DataTeste {
    public static void main(String[] args) {



        Data p1 = new Data();
        p1.data = 1;
        p1.mes = 1;
        p1.ano = 1970;

        Data p2 = new Data(24,2,2006); //Modo que o Joao ensinou.

        System.out.println(p1.obterData());
        System.out.println(p2.obterData());


    }
}
