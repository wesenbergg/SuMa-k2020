package builder;

public class BurgerDirector {
	private HamburgerBuilder hamburgerBuilder;
	
	public void setPizzaBuilder(HamburgerBuilder hb) { hamburgerBuilder = hb; }
	
	public Object getHamburger() {
		try {
			if(hamburgerBuilder instanceof KahunaBuilder) {
				KahunaBuilder kb = (KahunaBuilder) hamburgerBuilder;
				return kb.getHamburger();
			}
			if(hamburgerBuilder instanceof KrustyBuilder) {
				KrustyBuilder kc = (KrustyBuilder) hamburgerBuilder;
				return kc.getHamburger();
			}
		} catch (Exception e) { System.out.println("cast error"); }
		return null;
	}
	
	public void buildHamburger() {
		hamburgerBuilder.createNewHamburger();
		hamburgerBuilder.buildBeef();
		hamburgerBuilder.buildBuns();
		hamburgerBuilder.buildSauce();
		hamburgerBuilder.buildVegetables();
	}
}
