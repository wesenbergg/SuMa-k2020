package pokemon;

import visitor.PokemonVisitor;

public class CharmanderState implements LizardPokemonState {
	private static CharmanderState INSTANCE = null;
	private static String name = "Charmander";
	private CharmanderState(){}
	
	@Override
	public String pokedexInfo() {
		return "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.";
	}

	@Override
	public String attack() {
		return name + " used Scratch";
	}
	
	public static synchronized CharmanderState getInstance(){
		if (INSTANCE == null){
			INSTANCE = new CharmanderState();
		}
		return INSTANCE;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
