package adapter;

public class Warrior implements Fighter {
	private String name;
	
	public Warrior(String name) {
		this.name = name;
	}
	
	@Override
	public void attack() {
		System.out.println(name + ": Leeeeeeroy Jenkins");
	}

	@Override
	public void defend() {
		System.out.println(name + ": Shields up!");
	}

	@Override
	public void escape() {
		System.out.println(name + ": RUN! DUN DUN dundundun");
	}

}
