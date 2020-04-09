package pokemon;

import visitor.PokemonVisitor;

public interface LizardPokemonState {
	public String getName();
	public String pokedexInfo();
	public String attack();
}
