package pokemon;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Pokemon liskoPokemon = new Pokemon();
		
		liskoPokemon.printPokedexInfo();
		proceed(lukija);
		
		for(int i = 0; i < 11; i++) {
			waitSecond();
			liskoPokemon.levelUp();
		}
		proceed(lukija);
		
		liskoPokemon.printPokedexInfo();
		proceed(lukija);
		
		for(int i = 0; i < 20; i++) {
			waitSecond();
			liskoPokemon.levelUp();
		}
		proceed(lukija);
		
		liskoPokemon.printPokedexInfo();
		proceed(lukija);
		
		lukija.close();
	}
	
	private static void proceed(Scanner lukija) {
		System.out.println("\nPress [ Enter ] to proceed.");
		lukija.nextLine();
	}
	private static void waitSecond() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
