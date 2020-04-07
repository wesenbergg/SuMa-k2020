package chain;

public class Päällikkö extends Henkilokunta {
	private final double MAXKOROTUS = 5;
	
	public void kasitteleKorotus(Palkankorotus korotus) {
		if(korotus.getKorotus() > MAXKOROTUS)
			super.kasitteleKorotus(korotus);
		else
			System.out.println("Päällikkö käsitteli henkilön " + korotus.getHenkilo() + " palkankorotuksen. " + korotus.getKorotus() + "%");
	}
}
