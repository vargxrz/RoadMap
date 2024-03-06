package Classe.ExemplosClasseDoCurso.DesafioClassesMetodos;

public class Jantar {
    public static void main(String[] args) {
        // Criação de uma instância da classe Pessoa com nome "Joao" e peso 62.0 kg
        Pessoa pessoa = new Pessoa("Joao", 62.0);
        // Criação de uma instância da classe Comida com nome "prato feito" e peso 0.500 gramas
        Comida comida = new Comida("prato feito", 0.500);

        System.out.println(pessoa.nome + " tem " + pessoa.peso + "kg.");
        System.out.println(comida.nomeDaComida + " tem " + comida.pesoDaComida + " gramas");

        // Chamada do método 'comer' da classe Pessoa, passando a comida como argumento
        pessoa.comer(comida);

        System.out.println(pessoa.nome + " comeu " + comida.nomeDaComida + " e engordou " + pessoa.peso + "kg.");
    }
}
