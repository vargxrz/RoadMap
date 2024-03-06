package OrientacaoaObjetos.EncapsulamentoCursoJava.EncapsulamentoCasaB;

import OrientacaoaObjetos.EncapsulamentoCursoJava.EncapsulamentoCasaA.Ana;

public class Julia {

    void testeAcesso () {
        Ana sogra = new Ana();

//        System.out.println(sogra.segredo); private //  nao funciona
//        System.out.println(sogra.facoDentroDeCasa);  default // nao funciona
//        System.out.println(sogra.formaDeFalar);  protect //  nao funciona
        System.out.println(sogra.todosSabem); //public funciona
    }
}
