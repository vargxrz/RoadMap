package ArraysCollections.CursoCollections;

public class EqualsUsuario {
    String nome;
    String email;

    public boolean equals(Object obj) {

if (obj instanceof EqualsUsuario){
    EqualsUsuario usuario = (EqualsUsuario) obj;

    boolean nomeIgual = usuario.nome.equals(this.nome);
    boolean emailIgual = usuario.email.equals(this.email);

    return nomeIgual && emailIgual; }
    else {
    return false;
        }
    }
}
