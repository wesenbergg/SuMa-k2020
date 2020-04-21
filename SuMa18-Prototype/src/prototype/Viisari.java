package prototype;

public class Viisari implements Cloneable {
	private int maxArvo = 60;
	private int arvo = 0;
	
	public Viisari() {}
	
	public Viisari(int maxArvo) {
		this.maxArvo = maxArvo;
	}
	
	public void setArvo(int arvo) {
		this.arvo = arvo;
	}
	
	public boolean tikita() {
		arvo++;
		if(arvo < maxArvo) return false;
		arvo = 0;
		return true;
	}
	
	protected Viisari clone() throws CloneNotSupportedException {
		return (Viisari) super.clone();
	}
	
	@Override
	public String toString() {
		return arvo < 10 ? "0"+arvo: ""+arvo;
	}
}
