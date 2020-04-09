package pokemon;

import visitor.PokemonVisitor;

public class Pokemon {
	private LizardPokemonState state;
	private int level;
	private int points = 0;
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Pokemon() {
		state = CharmanderState.getInstance();
		level = 5;
	}
	
	public Pokemon(int level) {
		state = CharmanderState.getInstance();
		this.level = level;
		while(checkEvolve());
	}
	
	public void levelUp() {
		level++;
		System.out.println("Level up!\nYour " + state.getName() + " grew to level " + level + "!");
		if(checkEvolve())
			System.out.println("Your pokemon evolved to " + state.getName() + "!");
	}
	
	public void printPokedexInfo() {
		System.out.println("Name: " + state.getName() + " lvl." + level + "\n" + "Demonstrate main attack: " + state.attack());
		System.out.println("Info: " + state.pokedexInfo());
		System.out.println("This pokemon has collected: " + points + " bonus points.\n");
	}
	
	private boolean checkEvolve() {
		if(level > 15 && this.state.getName().contains("Charmander")) 
			return changeState(CharmeleonState.getInstance());

		if(level > 35 && this.state.getName().contains("Charmeleon")) 
			return changeState(CharizardState.getInstance());
		
		return false;
	}
	
	private boolean changeState(LizardPokemonState newState) {
		this.state = newState;
		return true;
	}
	
	public void acceptVisitor(PokemonVisitor visitor) {
		try {
			switch (state.getName()) {
			case "Charmander":
				visitor.visitCharmander(this);
				break;
			case "Charmeleon":
				visitor.visitCharmeleon(this);
				break;
			case "Charizard":
				visitor.visitCharizard(this);
			default:
				break;
			}
		} catch(Exception e) { System.out.println(e); }
	}

}
