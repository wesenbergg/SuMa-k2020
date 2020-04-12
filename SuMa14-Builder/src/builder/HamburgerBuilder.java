package builder;

public abstract class HamburgerBuilder {	
	//public Hamburger getHamburger() { return hamburger; }
	//public String getHamburger() { return hamburger.getBeef(); }
	
	public abstract void createNewHamburger();
	public abstract void buildBeef();
	public abstract void buildBuns();
	public abstract void buildSauce();
	public abstract void buildVegetables();
}
