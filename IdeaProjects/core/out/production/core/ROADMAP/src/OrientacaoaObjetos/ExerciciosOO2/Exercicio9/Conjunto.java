package OrientacaoaObjetos.ExerciciosOO2.Exercicio9;

import OrientacaoaObjetos.ExerciciosOO2.Exercicio6.ValoresContrariosException;

import java.util.ArrayList;

public class Conjunto extends ArrayList<Integer> {

    ArrayList<Integer> elementos = new ArrayList<>();

    public void adicionarElemento(int novoElemento){
        if (!elementos.contains(novoElemento)) {
            elementos.add(novoElemento);
        }
    }

    public void verificarElementoSeEhExistente(int elemento) {
        if (elementos.contains(elemento)) {
            System.out.println("Esse elemento já faz parte do conjunto.");
        }
    }

    public ArrayList<Integer> uniao(ArrayList<Integer> elementos1, ArrayList<Integer> elementos2, ArrayList<Integer> elementos3) {
        elementos3.addAll(elementos1);
        for (int j : elementos2) {
            boolean encontrar = false;
            for (int k : elementos1) {
                if (j == k) {
                    encontrar = true;
                    break;
                }
            }
            if (!encontrar) {
                elementos3.add(j);
            }
        }
        return elementos3;
    }

    public ArrayList<Integer> inter(ArrayList<Integer> elementos1, ArrayList<Integer> elementos2) {
        ArrayList<Integer> elementosInter = new ArrayList<>();

        for (Integer elemento : elementos1) {
            if (elementos2.contains(elemento)) {
                elementosInter.add(elemento);
            }
        }
        return elementosInter;
    }

    public ArrayList<Integer> menos(ArrayList<Integer> elementos2) {
        ArrayList<Integer> resultado = new ArrayList<>(elementos);

        resultado.removeAll(elementos2);

        return resultado;
    }
}

