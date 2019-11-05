
import java.util.ArrayList;
import java.util.Hashtable;

public class Jugador {
    private String nombre;
    private ArrayList<Pokemon> pokes;
    public Jugador(String nombre,ArrayList<Pokemon> pokemons){
        this.nombre = nombre;
        this.pokes = pokemons;
    }

    public ArrayList<Pokemon> getPokes() {
        return pokes;
    }
    
   
    public String getNombre() {
        return nombre;
    }
}
