package memento;

import java.util.Random;

public class Arvuuttaja {
	private static Random rand = new Random();
	private static Arvuuttaja INSTANCE = null;
	
	private Arvuuttaja() {}
	
	public void liityPeliin(Arvuri arvuri) {
		Memento memento = new Memento(rand.nextInt(10) + 1);
		arvuri.setMemento(memento);
	}

	public boolean tarkistaArvaus(Object obj, int arvaus) {
		try {
			Memento memento = (Memento) obj;
			return (memento.getLuku() == arvaus);
		} catch(ClassCastException e) { System.out.println(e); }
		return false;
	}
	
	static synchronized Arvuuttaja getInstance() {
		if(INSTANCE == null) return new Arvuuttaja();
		return INSTANCE;
	}
	
	//Memento on Arvuuttajan sisäluokka
	private class Memento {
		private int luku;

		public Memento(int luku) {
			this.luku = luku;
		}
		
		public int getLuku() {
			return luku;
		}
	}
}
