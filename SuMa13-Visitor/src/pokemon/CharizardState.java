package pokemon;

import visitor.PokemonVisitor;

public class CharizardState implements LizardPokemonState {
	private static CharizardState INSTANCE = null;
	private static String name = "Charizard";
	private CharizardState() { }
	
	@Override
	public String pokedexInfo() {
		return "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.";
	}

	@Override
	public String attack() {
		return name + " used Flamethrower";
	}
	
	public static synchronized CharizardState getInstance(){
		if (INSTANCE == null){
			INSTANCE = new CharizardState();
		}
		return INSTANCE;
	}

	@Override
	public String getName() {
		return name;
	}
}
