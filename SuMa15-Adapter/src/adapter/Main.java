package adapter;

public class Main {

	public static void main(String[] args) {
		Fighter warrior = new Warrior("Lancelot");
		Fighter caster = new CasterToFighterAdapter("Merlin");
		
		warrior.attack();
		warrior.defend();
		warrior.escape();
		System.out.println();
		caster.attack();
		caster.defend();
		caster.escape();
	}

}
