package ArraysCollections.ListExercicio;

import java.util.ArrayList;

public class Nivel1 {
    public static void main(String[] args) {

        int contagemIguais = 0;
        int contagemPar = 0;
        int contagemPar1 = 0;
        int maior1 = 0;
        int maior = 0;


        int sizeList = 10;

        ArrayList<Integer> numeros = new ArrayList<>();

        ArrayList<Integer> numeros1 = new ArrayList<>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(12);
        numeros.add(9);
        numeros.add(1);
        numeros.add(0);

        numeros1.add(5);
        numeros1.add(2);
        numeros1.add(7);
        numeros1.add(12);
        numeros1.add(9);
        numeros1.add(17);
        numeros1.add(14);

        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0){
                contagemPar++;
            }
            if (numeros1.get(i) % 2 == 0){
                contagemPar1++;
            }
            if (numeros.get(i) > maior){
                maior = numeros.get(i);
            }
            if (numeros1.get(i) > maior){
                maior1 = numeros1.get(i);
            }
            for (int j = 0; j < numeros1.size(); j++) {
                if (numeros.get(i) == numeros1.get(j)){
                    contagemIguais++;
                }
            }
        }

        System.out.println("A quantidade de numeros pares na primeira lista é: " + contagemPar);
        System.out.println("A quantidade de numeros pares na segunda lista é: " + contagemPar1);
        System.out.println("O maior numero da primeira lista é: " + maior);
        System.out.println("O maior numero da segunda lista é: " + maior1);
        System.out.println("A quantidade de numeros iguais entre " + numeros + " e " + numeros1 + " é: " + contagemIguais);
    }
}

