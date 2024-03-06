package ArraysCollections.CursoCollections;

import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {

        HashSet<ListUsuario> usuarios = new HashSet<ListUsuario>();

        usuarios.add(new ListUsuario("Pedro"));
        usuarios.add(new ListUsuario("Ana"));
        usuarios.add(new ListUsuario("Guilherme"));

        boolean resultado = usuarios.contains(new ListUsuario("Pedro"));
        System.out.println(resultado);
    }
}
