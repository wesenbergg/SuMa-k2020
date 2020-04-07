package memento;

public class Arvuri implements Runnable {
	private Object obj;
	private String name;
	
	public Arvuri(String name) {
		this.name = name;
	}
	
	public void setMemento(Object memento) {
		this.obj = memento;
	}
	
	private boolean teeArvaus(int arvaus) {
		return Arvuuttaja.getInstance().tarkistaArvaus(obj, arvaus);
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
