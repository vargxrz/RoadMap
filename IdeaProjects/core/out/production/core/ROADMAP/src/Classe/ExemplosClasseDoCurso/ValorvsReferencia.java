package Classe.ExemplosClasseDoCurso;

public class ValorvsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;  //Atribuicao por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + "\n" + b);

        Data d1 = new Data(24, 2, 2006);
        Data d2 = d1; // Atribuiçao por referencia (Objeto)

        d1.data = 31;
        d1.mes = 12;
        d1.ano = 2002;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.data = 24;
        d.mes = 2;
        d.ano = 2006;
    }
    static void alterarPrimitivo(int c){
        c++;

    }
}
