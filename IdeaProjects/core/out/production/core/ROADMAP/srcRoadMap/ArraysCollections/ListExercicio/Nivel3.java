package ArraysCollections.ListExercicio;

import java.util.ArrayList;

public class Nivel3 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();

        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(5);
        lista1.add(2);
        lista1.add(8);
        lista1.add(12);
        lista1.add(9);
        lista1.add(1);
        lista1.add(0);

        lista2.add(5);
        lista2.add(2);
        lista2.add(8);
        lista2.add(12);
        lista2.add(18);
        lista2.add(13);
        lista2.add(34);

        System.out.println(Uniao(lista1, lista2));
    }

    public static ArrayList<String> Uniao(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<String> lista3 = new ArrayList<>();

        for (int i : lista1) {
            lista3.add(i + "");
        }
        for (int j = 0; j < lista2.size(); j++) {
            boolean encontrar = false;
            for (int k = 0; k < lista1.size(); k++) {
                if (lista2.get(j) == lista1.get(k)) {
                    encontrar = true;
                    break;
                }
            }
            if (!encontrar) {
                lista3.add(lista2.get(j) + "");
            }
        }
        return lista3;
    }
}
