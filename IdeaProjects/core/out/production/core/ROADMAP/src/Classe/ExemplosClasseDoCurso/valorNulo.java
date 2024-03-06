package Classe.ExemplosClasseDoCurso;

public class valorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        Data p1 = Math.random() > 0.5 ? new Data() : null;

        if(p1 != null){
            p1.data = 23;
            p1.mes = 3;
            p1.ano = 2000;
            System.out.println(p1.obterData());

        }
        String s2 = Math.random() > 0.5 ? "Opa" : null;

        if(s2 != null);{
        System.out.println(s2.concat("????"));
        }
    }
}
