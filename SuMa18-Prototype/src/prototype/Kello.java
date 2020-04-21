package prototype;

public class Kello implements Cloneable {
	
	public void tikitaKelloa() {
		if(sekunttiViisari.tikita())//kasvattaa viisarin arvoa yhdellä, palauttaa true jos viisarin arvo ylittyy maximin
			if(minuuttiViisari.tikita())
				tuntiViisari.tikita();
	}
	
	public void asetaViisarit(int tunti, int minuutti, int sekuntti) {
		tuntiViisari.setArvo(tunti);
		minuuttiViisari.setArvo(minuutti);
		sekunttiViisari.setArvo(sekuntti);
	}
	
	@Override
	protected Kello clone() {
		Kello kello = null;
		try {
			kello = (Kello) super.clone();
			kello.tuntiViisari.clone();
			kello.minuuttiViisari.clone();
			kello.sekunttiViisari.clone();
		} catch(CloneNotSupportedException e) {}
		
		return kello;
	}
	
	@Override
	public String toString() {
		return tuntiViisari.toString() + "." + minuuttiViisari + "." + sekunttiViisari;
	}
	
	private Viisari tuntiViisari = new Viisari(24); //max viisarin arvo 24 ylikirjoittaa oletuksen (60)
	private Viisari minuuttiViisari = new Viisari();
	private Viisari sekunttiViisari = new Viisari();
}
