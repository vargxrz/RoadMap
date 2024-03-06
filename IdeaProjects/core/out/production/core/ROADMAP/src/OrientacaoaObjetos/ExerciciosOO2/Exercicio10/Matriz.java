package OrientacaoaObjetos.ExerciciosOO2.Exercicio10;

import java.util.Scanner;

public class Matriz implements Cloneable {
    int linha;
    int coluna;
    int[][] valores;

    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.valores = new int[linha][coluna];
    }

    public void setValor(int linha, int coluna, int valor) {
        if (valores.length > linha && valores[linha].length > coluna) {
            valores[linha][coluna] = valor;
        }
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean eQuadrado() {
        if (linha != coluna) {
            return false;
        }
        return true;
    }

    public boolean verificarForaDaDiagonal() {
        int i = 0;
        for (int j = 0; j < coluna; j++) {
            if (i != j && valores[i][j] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean comparacaoSemantica(Matriz matriz) {
        return this.linha != matriz.linha && this.coluna != matriz.coluna;
    }

    public Matriz obterMatrizTransposta() {
        Matriz matrizTransposta = new Matriz(coluna, linha);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizTransposta.setValor(j, i, this.valores[i][j]);
            }
        }
        return matrizTransposta;
    }

    public Matriz gerarMatrizOposta() {
        Matriz oposta = new Matriz(linha, coluna);
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                oposta.setValor(i, j, (this.valores[i][j] * -1));
            }
        }
        return oposta;
    }

    public boolean verificarMatrizIdentidade() {
        if (!eQuadrado()) {
            return false;
        }
        for (int i = 0; i < linha; i++) {
            if (valores[i][i] != 1) {
                return false;
            }
            verificarForaDaDiagonal();
        }
        return true;
    }

    public boolean verificarMatrizDiagonal() {
        if (!eQuadrado()){
            return false;
        }
        for (int i = 0; i < linha; i++) {
            verificarForaDaDiagonal();
        }
        return true;
    }

    public boolean verificarMatrizSingular() {
        if (!eQuadrado()){
            return false;
        }
        for (int j = 1; j < coluna; j++) {
            if (valores[0][0] != valores[j][j]) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarMatrizSimetrica() {
        Matriz tranposta = obterMatrizTransposta();
        if (!eQuadrado()){
            return false;
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (tranposta.valores[i][j] != valores[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificarMatrizAntiSimetrica() {
        Matriz oposta = gerarMatrizOposta();
        Matriz tranposta = obterMatrizTransposta();
        if (!eQuadrado()){
            return false;
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (oposta.valores[i][j] != tranposta.valores[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void adicionarMatriz(Matriz matriz) {
        if (matriz.getLinha() != this.linha && matriz.getColuna() != this.coluna) {
            System.out.println("As matrizes possuem ordens diferentes!");
            return;
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                this.setValor(i, j, matriz.valores[i][j] + this.valores[i][j]);
            }
        }
    }

    public void subtrairMatriz(Matriz matriz) {
        if (matriz.getLinha() != this.linha && matriz.getColuna() != this.coluna) {
            System.out.println("As matrizes possuem ordens diferentes!");
            return;
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                this.setValor(i, j, this.valores[i][j] - matriz.valores[i][j]);
            }
        }
    }

    public void multiplicarMatriz(Matriz matriz) {
        if (this.coluna != matriz.linha) {
            System.out.println("As matrizes retornam ordens diferentes!");
            return;
        }
        for (int i = 0; i < this.linha; i++) {
            for (int j = 0; j < matriz.coluna; j++) {
                this.setValor(i, j, this.valores[i][j] * matriz.valores[j][i]);
            }
        }
    }

    public Matriz clone() throws CloneNotSupportedException {
        return (Matriz) super.clone();
    }

    public String toString() {
        StringBuilder textoMatriz = new StringBuilder();

        for (int i = 0; i < this.linha; i++) {
            textoMatriz.append("| ");
            for (int j = 0; j < this.coluna; j++) {
                textoMatriz.append(this.valores[i][j] + " | ");
            }
            textoMatriz.append("\n");
        }

        return textoMatriz.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        int linha;
        int coluna;
        int valor;



        try {
            System.out.print("Digite o tamanho da sua matriz\n\nDigite a linha da sua matriz: ");
            int tamanhoLinha = scanner.nextInt();
            System.out.print("Digite a coluna da sua matriz: ");
            int tamanhoColuna = scanner.nextInt();

            int tamanhomatriz = tamanhoColuna * tamanhoLinha;
            Matriz matriz2 = new Matriz(tamanhoLinha, tamanhoColuna);

            for (int i = 1; i <= tamanhomatriz; i++) {
                System.out.print("\nDigite a linha " + i + " : ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna " + i + " : ");
                coluna = scanner.nextInt();
                System.out.print("Digite o valor " + i + ": ");
                valor = scanner.nextInt();
                matriz2.setValor(linha, coluna, valor);
            }
            System.out.println(matriz2.toString());
        } catch (Exception e) {
            System.out.println("Invalido! Somente numeros...");
        }
    }
}
