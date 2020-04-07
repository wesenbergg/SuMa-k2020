package chain;

public class Esimies extends Henkilokunta {
	private final double MAXKOROTUS = 2;
	
	public void kasitteleKorotus(Palkankorotus korotus) {
		if(korotus.getKorotus() > MAXKOROTUS)
			super.kasitteleKorotus(korotus);
		else
			System.out.println("Esimies käsitteli henkilön " + korotus.getHenkilo() + " palkankorotuksen. " + korotus.getKorotus() + "%");
	}
}
