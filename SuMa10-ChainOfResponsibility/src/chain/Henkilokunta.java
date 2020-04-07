package chain;

public abstract class Henkilokunta {
	private Henkilokunta seuraaja;
	
	public void setSeuraaja(Henkilokunta seuraaja) {
		this.seuraaja = seuraaja;
	}
	
	public void kasitteleKorotus(Palkankorotus korotus) {
		if(seuraaja == null) return;
		seuraaja.kasitteleKorotus(korotus);
	}
}
