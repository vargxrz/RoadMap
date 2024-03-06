package ArraysCollections.CursoCollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        // Tentativa de adicionar elementos duplicados ao conjunto
        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é: " + conjunto.size());

        // Remove elementos do conjunto e imprime os resultados
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é "+ conjunto.size());

        // Verifica se determinados elementos estão no conjunto e imprime os resultados
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // Mantém apenas os elementos comuns entre conjunto e nums e imprime o resultado
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        // Limpa todos os elementos do conjunto e imprime o resultado
        conjunto.clear();
        System.out.println(conjunto);
    }
}
