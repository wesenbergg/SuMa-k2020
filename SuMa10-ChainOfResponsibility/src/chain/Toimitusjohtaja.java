package chain;

public class Toimitusjohtaja extends Henkilokunta {
	public void kasitteleKorotus(Palkankorotus korotus) {
		System.out.println("Toimitusjohtaja käsitteli henkilön " + korotus.getHenkilo() + " palkankorotuksen. " + korotus.getKorotus() + "%");
	}
}
