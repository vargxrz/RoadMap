package OrientacaoaObjetos.ExerciciosOO2.Exercicio6;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio5.ValorNegativoException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Pais {
    String codigoIso;
    String nome;
    long dimensao;
    long populacao;
    List<Pais> fronteiras;
    public Pais(long populacao, String codigoIso, String nome, long dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoIso() {
        return codigoIso;
    }
    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao){
        this.populacao = populacao;
    }

    public void setCodigoIso(String codigoIso) throws ValoresContrariosException{
        if (codigoIso.length() == 6 && codigoIso.charAt(codigoIso.length()-2) == '-') {
            this.codigoIso = codigoIso;
        } else {
            throw new ValoresContrariosException("Voce digitou o codigo Iso invalido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ValoresContrariosException{
        if (Pattern.matches("[a-zA-Z]+", nome)) {
            this.nome = nome;
        } else  {
            throw new ValoresContrariosException("Voce digitou um nome invalido!");
        }
    }

    public void setFronteiras(List<Pais> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public long getDimensao() {
        return dimensao;
    }

    public void setDimensao(long dimensao){
        this.dimensao = dimensao;
    }

    public boolean verificar(Pais pais) {
        return this.codigoIso.equals(pais.getCodigoIso());
    }
    public double densidade() {
       return (double) populacao / dimensao;
    }
    public boolean verificarLimitrofe(Pais pais) {
        return fronteiras.contains(pais);
    }
    public List<Pais> retornarVizinhosComum(Pais pais) {
        List<Pais> vizinhos = new ArrayList<>();
        for (int i = 0; i < fronteiras.size(); i++) {
            if (pais.getFronteiras().contains(fronteiras.get(i))){
                vizinhos.add(fronteiras.get(i));
            }
        }
     return vizinhos;
    }

    public String toString() {
        return "Nome: " + nome;
    }
}
