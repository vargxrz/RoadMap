package ArraysCollections.CursoArray;

import java.util.Random;

public class ArrayGenerator {
    private static Random rand;
    private static char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'w', 'x', 'y', 'z'};
    public static int[] generateIntArray(int size){
        int[] arr = new int[size];
        rand = new Random();

        for (int i = 0; i < arr.length; i++){
            int number = rand.nextInt(1, 20);

            while(existNumber(arr, number, i)){
                number = rand.nextInt(1, 20);
            }

            arr[i] = number;
        }

        return arr;
    }

    public static String[] generateStringArray(int size){
        String[] arr = new String[size];
        rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = generateWord();
        }

        return arr;
    }

    private static Boolean existNumber(int[] arr, int number, int sizeUsed){
        for (int i = 0; i <= sizeUsed; i++){
            if (arr[i] == number){
                return true;
            }
        }

        return false;
    }
    private static String generateWord(){
        int sizeWord = rand.nextInt(0, alfabeto.length);
        String newWord = "";
        for (int i = 0; i < sizeWord; i++){
            newWord += alfabeto[rand.nextInt(0, (alfabeto.length-1))];
        }

        return newWord;
    }
}