package strategy;

import java.util.List;

public class OneColumn implements PrintStrategy {
	
	private OneColumn() {}
	
	@Override
	public void printItems(List<String> list) {
		for (String s : list)
			System.out.println(s);
		System.out.println("\n");
	}	

	public synchronized static PrintStrategy getInstance() {
		if(INSTANCE == null) INSTANCE = new OneColumn();
		return INSTANCE;
	}
	
	private static PrintStrategy INSTANCE;
}
