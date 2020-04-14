package builder;

import java.util.ArrayList;
import java.util.List;

import burger.Beef;
import burger.Buns;
import burger.BurgerPart;
import burger.Sauce;
import burger.Vegetables;

public class KrustyBuilder extends HamburgerBuilder {
	private List<BurgerPart> hamburger;
	
	@Override
	public void buildBeef() {
		hamburger.add(new Beef());
	}

	@Override
	public void buildBuns() {
		hamburger.add(new Buns());
	}

	@Override
	public void buildSauce() {
		hamburger.add(new Sauce());
	}

	@Override
	public void buildVegetables() {
		hamburger.add(new Vegetables());
	}
	
	public List<BurgerPart> getHamburger() {
		return hamburger;
	}

	@Override
	public void createNewHamburger() {
		hamburger = new ArrayList<BurgerPart>();
	}
}
