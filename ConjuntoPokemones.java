import java.util.ArrayList;
public class ConjuntoPokemones
{                                            //nombre,  ptoVida,Ataque,defensa,Estado,Tipo
            public Pokemon poke1 = new Pokemon("Motapod",200,20,100,true,"Agua");
	    public Pokemon poke2 = new Pokemon("Pitochu",200,20,100,true,"Agua");
	    public Pokemon poke3 = new Pokemon("Pendertuga",200,20,100,true,"Agua");
	    public Pokemon poke4 = new Pokemon("ElAguelo",200,20,100,true,"Agua");

            public Pokemon poke5 = new Pokemon("ElBombo",200,20,100,true,"Fuego");
            public Pokemon poke6 = new Pokemon("Bistek",200,20,100,true,"Fuego");
            public Pokemon poke7 = new Pokemon("Nelson",200,20,100,true,"Fuego");
            public Pokemon poke8 = new Pokemon("Guachicolero",200,20,100,true,"Fuego");

            public Pokemon poke9 = new Pokemon("Bulbasur",200,20,100,true,"Aire");
            public Pokemon poke10 = new Pokemon("Gueson",200,20,100,true,"Aire");
            public Pokemon poke11 = new Pokemon("Petra ",200,20,100,true,"Aire");
            public Pokemon poke12 = new Pokemon("Murcio",200,20,100,true,"Aire");

            public Pokemon poke13 = new Pokemon("Rexona",200,20,100,true,"Electricidad");
            public Pokemon poke14 = new Pokemon("Pikachu",200,20,100,true,"Electricidad");
            public Pokemon poke15 = new Pokemon("Pantene",200,20,100,true,"Electricidad");
            public Pokemon poke16 = new Pokemon("Colgate",200,20,100,true,"Electricidad");

            public ConjuntoPokemones(){

	    }
            
            ArrayList<Pokemon> getPokemonsAL()
            {
                return pokemons;
            }
            
           
            
	    public ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() {{
	        add(poke1);
	        add(poke2);
	        add(poke3);
	        add(poke4);
	        add(poke5);
	        add(poke6);
	        add(poke7);
	        add(poke8);
	        add(poke9);
	        add(poke10);
	        add(poke11);
	        add(poke12);
	        add(poke13);
	        add(poke14);
	        add(poke15);
	        add(poke16);
	    }};
	               
}