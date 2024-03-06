import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IntegrationApi {
    private final String URL_INFO = "https://pokeapi.co/api/v2/pokemon-species/";
    private final String URL_TYPES = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemon(int parameter){
        Pokemon pokemon = null;
        PokemonType pokemonType = null;
        try {
            pokemon = convertStringToObject(getJson((URL_INFO + parameter)), Pokemon.class);
            pokemonType = convertStringToObject(getJson((URL_TYPES + parameter)), PokemonType.class);

            pokemon.setTypes(pokemonType.getTypes().stream().map(type -> type.getType()).toList());
        } catch(Exception ex){
            System.out.println("Não foi possível realizar a busca do pokémon");
        }

        return pokemon;
    }

    private String getJson(String strConnection){
        String json = "";

        try {
            URL url = new URL(strConnection);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line+"\n");
            }
            br.close();
            json = sb.toString();
        }
        catch (Exception ex){
            System.out.println("Não foi possível realizar a busca: "+ex.getMessage());
        }
        finally {
            return json;
        }
    }

    private <T> T convertStringToObject(String jsonString, Class<T> type){
        ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);;
        T object = null;

        try {
            object = mapper.readValue(jsonString, type);
        }
        catch (JsonProcessingException ex){
            System.out.println("Não foi possível converter o json");
        }

        return object;
    }
}