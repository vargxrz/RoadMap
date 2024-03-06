package ArraysCollections.ArraysExercicio;

public class Nivel1 {
    public static void main(String[] args) {

        int maior = 0;
        int contagemPar = 0;
        int contagem = 0;
        int[] numero1 = {2, 6, 23, 54, 12, 15, 98};
        int[] numero2 = {4, 2, 76, 43, 12, 15, 23};

        for (int i = 0; i < numero1.length; i++) {
            if (numero1[i] % 2 == 0) {
                contagemPar++;
            }
        }
        for (int i = 0; i < numero1.length; i++) {
            if (numero1[i] > numero1[maior]) {
                maior = i;
            }
        }
        for (int i = 0; i < numero1.length; i++) {
            for (int j = 0; j < numero2.length; j++) {
                if (numero1[i] == numero2[j]){
                    contagem++;
                }
            }

        }


        System.out.println("A quantidade de numeros pares é: " + contagemPar);
        System.out.println("O maior numero é: " + numero1[maior]);
        System.out.println("A quantidade de numeros iguais entre as duas arrays é: " +contagem);
    }
}
