package builder;

import java.util.ArrayList;
import java.util.List;

public class KrustyBuilder extends HamburgerBuilder {
	private List<String> hamburger;
	
	@Override
	public void buildBeef() {
		hamburger.add("crabby patty with cheese on top");
	}

	@Override
	public void buildBuns() {
		hamburger.add("wheat buns with sesame");
	}

	@Override
	public void buildSauce() {
		hamburger.add("krustys super secret sauce");
	}

	@Override
	public void buildVegetables() {
		hamburger.add("salad and tomato");
	}
	
	public List<String> getHamburger() {
		return hamburger;
	}

	@Override
	public void createNewHamburger() {
		hamburger = new ArrayList<String>();
	}
}
