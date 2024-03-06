package ArraysCollections.CursoArray;

public class ForeachExercicio {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[5];
        notasAlunoA[0] = 7;
        notasAlunoA[1] = 5;
        notasAlunoA[2] = 8;
        notasAlunoA[3] = 10;
        notasAlunoA[4] = 9;


        double totalAlunoA = 0;
        System.out.print("Nota aluno A: ");
        for (double notasA : notasAlunoA) {
            totalAlunoA += notasA;
            System.out.print(notasA + ", ");
        }
        System.out.print("\nA media de notas do aluno A é: " + totalAlunoA / notasAlunoA.length+"\n");

        double [] notasAlunoB = {6, 3, 7, 8};

        double totalAlunoB = 0;
        System.out.print("Nota aluno A: ");
        for (double notasB : notasAlunoB) {
            totalAlunoB += notasB;
            System.out.print(notasB + ", ");
        }
        System.out.print("\nA media de notas do aluno B é: "+  totalAlunoB / notasAlunoB.length);
    }
}
