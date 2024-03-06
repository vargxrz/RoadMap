package ArraysCollections.CursoCollections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<ListUsuario> lista = new ArrayList<>();

        ListUsuario n1 = new ListUsuario("Vargas");
        lista.add(n1);
        lista.add(new ListUsuario("Joao"));
        lista.add(new ListUsuario("Kauan"));
        lista.add(new ListUsuario("Felipe"));
        lista.add(new ListUsuario("Ricardo"));
        lista.add(new ListUsuario("Baer"));
        lista.add(new ListUsuario("Fernando"));
        lista.add(new ListUsuario("Alessandro"));
        lista.add(new ListUsuario("Italo"));

      //  lista.remove(2); REMOVER DA LISTA.m

        for (ListUsuario u: lista){
            System.out.println(u.toString());
        }
    }
}
