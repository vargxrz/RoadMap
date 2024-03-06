package ArraysCollections.CursoCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Adicionam elementos a fila
       // A diferenca entre add e offer é quando a fila esta cheia

        fila.add("Sthefany"); // retorna false
        fila.offer("Maria"); // lanca uma exceçao

        //peek e element -->> obter o proximo elemento da fila ( sem remover )
        //Diferenca de peek e element é quando a fila esta vazia

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // lanca uma exceçao


        // poll e remove -->> obter o proximo elemento da fila e remove!
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
