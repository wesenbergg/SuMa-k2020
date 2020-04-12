package builder;

public class KahunaBuilder extends HamburgerBuilder {
	KahunaBurger hamburger;
	
	@Override
	public void buildBeef() {
		hamburger.setBeef("juicy beef with cheese on top");
	}

	@Override
	public void buildBuns() {
		hamburger.setBuns("wheat buns no sesame");
	}

	@Override
	public void buildSauce() {
		hamburger.setSauce("no sauce motherfucker");
	}

	@Override
	public void buildVegetables() {
		hamburger.setVegetables("salad and pineapple");
	}
	
	public KahunaBurger getHamburger() {
		return hamburger;
	}

	@Override
	public void createNewHamburger() {
		hamburger = new KahunaBurger();
	}
}
