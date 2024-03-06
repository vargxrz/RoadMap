package Classe.ExemplosClasseDoCurso;

public class Data {
    int data;
    int mes;
    int ano;

   //Data(){
   //    this(1, 7, 1970);  exemplo This.


    Data(int data, int mes, int ano) {
        this.data = data;
        this.mes = mes;
        this.ano = ano;

    }

    public Data() {

    }

    String obterData() {

        return "A minha data de nascimento é: " +  data + "/" + mes + "/" + ano;
    }
}


