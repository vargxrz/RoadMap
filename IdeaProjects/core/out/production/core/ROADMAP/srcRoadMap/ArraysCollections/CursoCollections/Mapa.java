package ArraysCollections.CursoCollections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();

        //put -> adicionar
        usuario.put(1, "Roberto");
        usuario.put(2, "Ricardo");
        usuario.put(3, "Renato");

        System.out.println(usuario.size()); //tamanho das chaves

        System.out.println(usuario.keySet()); //chaves usadas
        System.out.println(usuario.values()); //nomes usados
        System.out.println(usuario.entrySet()); //chaves e nomes

        System.out.println(usuario.containsKey(2)); //verifica se a chave é a informada( no caso 2 = true )
        System.out.println(usuario.containsValue("Ricardo")); //verifica se o nome é o informada( no caso "Ricardo" = true )

        System.out.println(usuario.get(2)); //pega o nome informado na chave 2 = "Ricardo"

        for (int chave: usuario.keySet()){
            System.out.println(chave);
        }
        for (String valor: usuario.values()){
            System.out.println(valor);
        }
        for (Map.Entry<Integer, String> registro: usuario.entrySet()){
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
    }
}
