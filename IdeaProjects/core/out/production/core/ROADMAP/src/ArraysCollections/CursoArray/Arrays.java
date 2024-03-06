package ArraysCollections.CursoArray;

public class Arrays {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[5];
        notasAlunoA[0] = 7.6;
        notasAlunoA[1] = 3.5;
        notasAlunoA[2] = 8.0;
        notasAlunoA[3] = 10;
        notasAlunoA[4] = 9.0;

        System.out.println(java.util.Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);
        double [] notasAlunoB = {6.9, 5.3, 1.3, 8.4};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
