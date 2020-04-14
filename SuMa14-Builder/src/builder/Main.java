package builder;

public class Main {

	public static void main(String[] args) {
		BurgerDirector director = new BurgerDirector();
		HamburgerBuilder kahunaBuilder = new KahunaBuilder();
		HamburgerBuilder krustyBuilder = new KrustyBuilder();
		
		director.setBurgerBuilder(kahunaBuilder);
		director.buildHamburger();		
		System.out.println(director.getHamburger());
		
		director.setBurgerBuilder(krustyBuilder);
		director.buildHamburger();		
		System.out.println(director.getHamburger());
	}

}
