package OrientacaoaObjetos.EncapsulamentoCursoJava.EncapsulamentoCasaB;

import OrientacaoaObjetos.EncapsulamentoCursoJava.EncapsulamentoCasaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();
    void testeAcessos() {
       //   System.out.println(mae.segredo); // private //erro
       // System.out.println(mae.FacoDentroDeCasa); // default //erro
        System.out.println(FormaDeFalar); // protect  // funciona
        System.out.println(todosSabem); // public  // funciona
        System.out.println(new Ana().todosSabem); // public // funciona

    }
}
