package strategy;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	private PrintStrategy strategy;
	private List<String> items;
	
	public Printer(PrintStrategy strategy) {
		this.strategy = strategy;
		this.items = new ArrayList<String>();
	}
	
	public void setStrategy(PrintStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void addItem(String item) {
		items.add(item);
	}
	
	public void printItems() {
		strategy.printItems(items);
	}
}
