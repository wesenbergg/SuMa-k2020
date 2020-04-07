package chain;

public class Palkankorotus {
	private String henkilo;
	private double korotus;
	
	public Palkankorotus(String henkilo, double korotus) {
		this.henkilo = henkilo;
		this.korotus = korotus;
	}
	
	public String getHenkilo() {
		return henkilo;
	}
	public void setHenkilo(String henkilo) {
		this.henkilo = henkilo;
	}
	public double getKorotus() {
		return korotus;
	}
	public void setKorotus(int korotus) {
		this.korotus = korotus;
	}
	@Override
	public String toString() {
		return "Palkankorotus [henkilo=" + henkilo + ", korotus=" + korotus + "]";
	}
	
}
