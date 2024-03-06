package ArraysCollections.CursoCollections;

import java.util.Objects;

public class ListUsuario {


    String nome;

    ListUsuario(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "Meu nome é " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListUsuario that = (ListUsuario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

