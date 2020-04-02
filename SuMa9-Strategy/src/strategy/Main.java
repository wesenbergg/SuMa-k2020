package strategy;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(OneColumn.getInstance());
		
		printer.addItem("Yesterday\t");//tabit lisätty perään että olisi helpompi erottaa jäsenet
		printer.addItem("All my troubles seemed so far away\t");
		printer.addItem("Now it seems as though they're here to stay\t");
		printer.addItem("Oh, I believe in yesterday\t");
		printer.addItem("Go on\t");
		printer.addItem("Suddenly\t");
		printer.addItem("I'm not half the man I used to be\t");
		printer.addItem("There's a shadow hangin' over me\t");
		printer.addItem("Oh, yesterday came suddenly\t");
		printer.addItem("Why she had to go\t");
		printer.addItem("I don't know, she wouldn't say\t");
		printer.addItem("I said something wrong\t");
		printer.addItem("Now I long for yesterday\t");
		
		printer.printItems();
		
		printer.setStrategy(TwoColumn.getInstance());
		printer.printItems();
		
		printer.setStrategy(ThreeColumn.getInstance());
		printer.printItems();
	}
}
