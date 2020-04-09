package visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/**
 * SuMa 13 - Visitor
 * Main: luo uuden tiimin, näyttää tiimin tiedot, löytää pisteitä, "louhii" pisteitä 3 sekunttia, tulostaa tiimin uudelleen
 * Huomaa tulosteessa pisteet muuttuvat
 */
import pokemon.Pokemon;

public class Main {

	public static void main(String[] args) {
		BonusPoints bp = new BonusPoints();
		ArrayList<Pokemon> pokeTeam = new ArrayList<>();
		pokeTeam.addAll(Arrays.asList(new Pokemon(), new Pokemon(20), new Pokemon(40)));

		for (Pokemon pokemon : pokeTeam) {
			pokemon.printPokedexInfo(); // Jokaisella pokemonilla on 0 bonus pinnaa
		}
		
		System.out.println("Collecting bonus points...\n");
		waitSecond();
		for (Pokemon pokemon : pokeTeam) {
			pokemon.acceptVisitor(bp);
		}
		
		for (Pokemon pokemon : pokeTeam) {
			pokemon.printPokedexInfo(); // Bonuspinnat ovat kasvaneet
		}
	}
	
	private static void waitSecond() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
