package adapter;

public class CasterToFighterAdapter implements Fighter {

	private Caster caster;
	
	public CasterToFighterAdapter(String name) {
		caster = new Caster(name);
	}
	
	@Override
	public void attack() {
		caster.castSpell();
	}

	@Override
	public void defend() {
		caster.heal();
	}

	@Override
	public void escape() {
		caster.teleport();
	}

}
