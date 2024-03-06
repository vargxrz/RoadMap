package OrientacaoaObjetos.EncapsulamentoCursoJava.EncapsulamentoCasaA;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcessos() {
      //  System.out.println(esposa.segredo); // private erro
        System.out.println(esposa.FacoDentroDeCasa); // default
        System.out.println(esposa.FormaDeFalar); // protect
        System.out.println(esposa.todosSabem); // public
    }
}
