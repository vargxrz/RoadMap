package OrientacaoaObjetos.ExerciciosOO2.Exercicio2;

public class Ponto2D implements Cloneable{
    private int x;
    private int y;

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto2D) {
        this.x = ponto2D.getX();
        this.y = ponto2D.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void movimentar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void comparar(Ponto2D ponto2D) throws Exception {
        if (this.x != ponto2D.getX() || this.y != ponto2D.getY()) {
            throw new PosicaoDiferenteException("As posicoes nao sao iguais!");
        }
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public void calcularDistancia(Ponto2D ponto2D) {
        int horizontal = this.x - ponto2D.getX();
        int vertical = this.y - ponto2D.getY();
        System.out.println("A diferenca da posicao x é " + horizontal);
        System.out.println("A diferenca da posicao y é " + vertical);
    }

    @Override
    public Ponto2D clone() throws CloneNotSupportedException {
        return (Ponto2D) super.clone();
    }
    public boolean compararObjeto(Ponto2D ponto2D) {
        return this.equals(ponto2D);
    }
}
