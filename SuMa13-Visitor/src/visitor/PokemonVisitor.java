package visitor;

import pokemon.Pokemon;

public interface PokemonVisitor {
	public void visitCharmander(Pokemon charmander);
	public void visitCharmeleon(Pokemon charmeleon);
	public void visitCharizard(Pokemon charizard);
}
