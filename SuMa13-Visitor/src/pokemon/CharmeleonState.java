package pokemon;

import visitor.PokemonVisitor;

public class CharmeleonState implements LizardPokemonState {
	private static CharmeleonState INSTANCE = null;
	private static String name = "Charmeleon";
	private CharmeleonState(){}
	
	@Override
	public String pokedexInfo() {
		return "Charmeleon mercilessly destroys its foes using its sharp claws. If it encounters a strong foe, it turns aggressive. In this excited state, the flame at the tip of its tail flares with a bluish white color.";
	}

	@Override
	public String attack() {
		return name + " used Ember";
	}
	
	public static synchronized CharmeleonState getInstance(){
		if (INSTANCE == null){
			INSTANCE = new CharmeleonState();
		}
		return INSTANCE;
	}
	
	@Override
	public String getName() {
		return name;
	}
}