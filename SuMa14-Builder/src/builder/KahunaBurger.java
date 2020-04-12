package builder;

public class KahunaBurger {
	private String beef = "";
	private String buns = "";
	private String sauce = "";
	private String vegetables = "";
	
	public String getBeef() {
		return beef;
	}

	public String getBuns() {
		return buns;
	}

	public String getSauce() {
		return sauce;
	}

	public String getVegetables() {
		return vegetables;
	}
	
	public void setBeef(String beef) {
		this.beef = beef;
	}
	
	public void setBuns(String buns) {
		this.buns = buns;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	@Override
	public String toString() {
		return "Hamburger [beef=" + beef + ", buns=" + buns + ", sauce=" + sauce + ", vegetables=" + vegetables + "]";
	}
}
