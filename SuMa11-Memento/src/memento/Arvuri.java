package memento;

import memento.Arvuuttaja.Memento;

public class Arvuri implements Runnable {
	private Memento memento;
	private String name;
	
	public Arvuri(String name) {
		this.name = name;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	private boolean teeArvaus(int arvaus) {
		return Arvuuttaja.getInstance().tarkistaArvaus(memento, arvaus);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				boolean arvaus = teeArvaus(i);
				System.out.println(name + " arvasi " + (arvaus ? " oikein.": " väärin."));
				if(arvaus) break;
			}
		} catch(Exception e) { System.out.println(e); }
	}
}
