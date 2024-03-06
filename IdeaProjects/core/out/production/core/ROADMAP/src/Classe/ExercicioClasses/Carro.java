package Classe.ExercicioClasses;

public class Carro {
    String marca;
    String modelo;
    int velocidade;

    public Carro(String marca, String modelo, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void freiar(){
         velocidade -= 20;
        int velocidadeAtualizada = velocidade;
        if (velocidadeAtualizada <= 0){
            velocidade = 0;
        }
    }

    public void acelerar(){
        velocidade += 30;
    }

    public String toString(){
        return marca + " " + modelo + " está a " + velocidade + "Km";
    }
    }

