package OrientacaoaObjetos.ExerciciosOO2.Exercicio7;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio6.Pais;

import java.util.ArrayList;
import java.util.List;

public class Continente {

     String nome;
     List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionarPaises(Pais pais) {
        if(paises == null){
            paises = new ArrayList<>();
        }
        paises.add(pais);
    }
    public double retornarDimensao() {
        double territorioTotal = 0;
        for (int i = 0; i < paises.size(); i++) {
            territorioTotal += paises.get(i).getDimensao();
        }
        return territorioTotal;
    }

    public int retornarPopulacao() {
        int populacaoTotal = 0;
        for (int i = 0; i < paises.size(); i++) {
            populacaoTotal += paises.get(i).getPopulacao();
        }
        return populacaoTotal;
    }

    public double retornarDensidadePopulacional() {
        return retornarPopulacao() / retornarDimensao();
    }
    public Pais retornarPaisMaisPopuloso() {
        long maiorPopulacao = 0;
        int index = 0;
        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getPopulacao() > maiorPopulacao) {
                maiorPopulacao = paises.get(i).getPopulacao();
                index = i;
            }
        }
        return paises.get(index);
    }
    public Pais retornarPaisMenosPopuloso() {
        long menorPopulacao = 100000;
        int index = 0;
        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getPopulacao() < menorPopulacao) {
                menorPopulacao = paises.get(i).getPopulacao();
                index = i;
            }
        }
        return paises.get(index);
    }
    public Pais retornarPaisComMaiorTerritorio() {
        long maiorTerritorio = 0;
        int index = 0;
        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getDimensao() > maiorTerritorio) {
                maiorTerritorio = paises.get(i).getDimensao();
                index = i;
            }
        }
        return paises.get(index);
    }
    public Pais retornarPaisComMenorTerritorio() {
        long menorTerritorio = 10000000;
        int index = 0;
        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getDimensao() < menorTerritorio) {
                menorTerritorio = paises.get(i).getDimensao();
                index = i;
            }
        }
        return paises.get(index);
    }
    public long retornarRazaoTerritorial() {
       return retornarPaisComMaiorTerritorio().getDimensao() / retornarPaisComMenorTerritorio().getDimensao();
    }

}
