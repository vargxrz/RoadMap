package ArraysCollections.CursoCollections;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

       Set<String> lista = new TreeSet<>();
        //Set<String> lista = new HashSet<>();
        lista.add("Joao");
        lista.add("Baer");
        lista.add("Hille");
        lista.add("Ricardo");

        for (String candidato: lista){
            System.out.println(candidato);
        }
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
