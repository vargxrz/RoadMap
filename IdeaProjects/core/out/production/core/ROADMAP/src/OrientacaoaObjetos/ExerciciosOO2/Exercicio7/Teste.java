package OrientacaoaObjetos.ExerciciosOO2.Exercicio7;

import Classe.ExercicioClasses.Circulo;
import OrientacaoaObjetos.ExerciciosOO2.Exercicio6.Pais;

public class Teste {
    public static void main(String[] args) {

        Continente continente1 = new Continente("Asia");
        Pais pais1 = new Pais(1234, "323-9", "Japao", 123456);
        Pais pais2 = new Pais(123, "326-7", "China", 12345);
        Pais pais3 = new Pais(12345, "353-1", "India", 123);
        Pais pais4 = new Pais(123456, "321-3", "Indonesia", 1234);

        continente1.adicionarPaises(pais1);
        continente1.adicionarPaises(pais2);
        continente1.adicionarPaises(pais3);
        continente1.adicionarPaises(pais4);

        System.out.println("Dimensao do continente: " + continente1.retornarDimensao());
        System.out.println("Populacao do continente: " + continente1.retornarPopulacao());
        System.out.println("Densidade Populacional: " + continente1.retornarDensidadePopulacional());
        System.out.println("O maior pais em questao de territorio " + continente1.retornarPaisComMaiorTerritorio());
        System.out.println("O menor pais em questao de territorio " + continente1.retornarPaisComMenorTerritorio());
        System.out.println("O maior pais em questao de populaçao " + continente1.retornarPaisMaisPopuloso());
        System.out.println("O menor pais em questao de populacao " + continente1.retornarPaisMenosPopuloso());
        System.out.println("A razao entre o menor e o maior Pais é: " + continente1.retornarRazaoTerritorial());

    }
}
