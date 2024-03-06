import java.util.ArrayList;
import java.util.List;
public class Pokemon {
    private int id;
    private String name;
    private Color color;
    private Generation generation;
    private List<TypeInfo> types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public List<TypeInfo> getTypes() {
        return types;
    }

    public void setTypes(List<TypeInfo> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Pokémon: "+ this.name + "\nCor: " + this.color.getName() +
                "\nGeração:"+ this.generation.getName() + "\nTypes: "+ types.toString();
    }
}
