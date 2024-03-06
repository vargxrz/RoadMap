import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    Pokemon pokemon;
    List<String> letrasUtilizadas;
    List<String> letrasNaoUtilizadas;
    List<String> dicas;
    public static final int numeroDeTentativas = 5;
    int tentativas;
    boolean ganhou;

    public Jogo(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.letrasNaoUtilizadas = new ArrayList<>();
        this.letrasUtilizadas = new ArrayList<>();
        this.dicas = new ArrayList<>();
        this.tentativas = 0;
        this.ganhou = false;
    }

    @Override
    public String toString() {
        String palavra = retornarPalavraComAsteristicos();
        return "\nPalavra: " + palavra + "\nLetras não utilizadas:" + letrasNaoUtilizadas.toString() +
                "\nDicas: " + dicas.toString();
    }

    private String retornarPalavraComAsteristicos() {
        StringBuilder palavra = new StringBuilder();
        for (int i = 0; i < pokemon.getName().length(); i++) {
            if (letrasUtilizadas.contains(String.valueOf(pokemon.getName().charAt(i)))) {
                palavra.append(pokemon.getName().charAt(i));
            } else {
                palavra.append("*");
            }
        }
        return palavra.toString();
    }

    public void verificarNome(String tentivaNome) throws PerdeuException{
        for (int i = 0; i < tentivaNome.length(); i++) {
            for (int j = 0; j < pokemon.getName().length(); j++) {
                if (pokemon.getName().charAt(j) == tentivaNome.charAt(i)) {
                    letrasUtilizadas.add(String.valueOf(tentivaNome.charAt(i)));
                } else if (!letrasNaoUtilizadas.contains(String.valueOf(tentivaNome.charAt(i)))) {
                    letrasNaoUtilizadas.add(String.valueOf(tentivaNome.charAt(i)));
                }
            }
        }
        if (pokemon.getName().equalsIgnoreCase(tentivaNome)) {
            ganhou = true;
            return;
        }
        tentativas++;
        if (tentativas == numeroDeTentativas){
            throw new PerdeuException("Voce perdeu!");
        }
        adicionarDicas();
    }

    public void adicionarDicas() {
        switch(tentativas){
            case 1:
                dicas.add(pokemon.getGeneration().getName());
                break;
            case 2:
                dicas.add(pokemon.getColor().getName());
                break;
            case 3:
                dicas.add(pokemon.getTypes().get(0).getName());
                break;
            default:
                String type = pokemon.getTypes().get(0).getName();
                if (pokemon.getTypes().size() == 2){
                    type = pokemon.getTypes().get(1).getName();
                }
                dicas.add(type);
        }
    }

    public boolean getGanhou() {
        return ganhou;

    }
}
