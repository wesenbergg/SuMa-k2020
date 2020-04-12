package adapter;

public class Caster {
	private String name;
	
	public Caster(String name) {
		this.name = name;
	}
	
	
	public void castSpell() {
		System.out.println(name + " casted fire spell! DIE, INSECT");
	}

	
	public void heal() {
		System.out.println(name + " casted an ancient spell. "+name+" is covered with a strong barrier");
	}

	
	public void teleport() {
		System.out.println("Swish swish! "+name+" had enough of your bs. " +name+" teleported away.");
	}
}
