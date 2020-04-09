package visitor;

import pokemon.Pokemon;

public class BonusPoints implements PokemonVisitor {

	@Override
	public void visitCharmander(Pokemon charmander) {
		charmander.setPoints(charmander.getPoints() + 5);
	}

	@Override
	public void visitCharmeleon(Pokemon charmeleon) {
		charmeleon.setPoints(charmeleon.getPoints() + 15);
	}

	@Override
	public void visitCharizard(Pokemon charizard) {
		charizard.setPoints(charizard.getPoints() + 45);
	}

	

}
