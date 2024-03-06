package ArraysCollections.ArraysExercicio;

import ArraysCollections.CursoArray.ArrayGenerator;

import java.util.Arrays;

public class Nivel3 {
    public static void main(String[] args) {

        int[] array1 = ArrayGenerator.generateIntArray(5);
        int[] array2 = ArrayGenerator.generateIntArray(5);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        uniao(array1, array2);
    }

    public static void uniao(int[] array1, int[] array2) {
        StringBuilder v3 = new StringBuilder();
        for (int i : array1) {
            v3.append(i + "-");
        }
        for (int j = 0; j < array2.length; j++) {
            boolean encontrar = false;
            for (int k = 0; k < array1.length; k++) {
                if (array2[j] == array1[k]) {
                    encontrar = true;
                    break;
                }
            }
            if (!encontrar) {
                v3.append(array2[j] + "-");
            }
        }

        String[] array3 = v3.toString().split("-");
        System.out.println(Arrays.toString(array3));
    }
}

