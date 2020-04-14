package memento;

import java.util.Random;

public class Arvuuttaja {
	private static Random rand = new Random();
	private static Arvuuttaja INSTANCE = null;
	
	private Arvuuttaja() {}
	
	public void liityPeliin(Arvuri arvuri) {
		arvuri.setMemento(new Memento(rand.nextInt(10) + 1));
	}

	public boolean tarkistaArvaus(Memento memento, int arvaus) {
		return (memento.luku == arvaus);
	}
	
	static synchronized Arvuuttaja getInstance() {
		if(INSTANCE == null) return new Arvuuttaja();
		return INSTANCE;
	}
	
	//Memento on Arvuuttajan sisäluokka
	public class Memento {
		private int luku;

		private Memento(int luku) {
			this.luku = luku;
		}
	}
}
