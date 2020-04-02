package strategy;

import java.util.List;

public class TwoColumn implements PrintStrategy {

	private TwoColumn() { }
	
	@Override
	public void printItems(List<String> list) {
		Object[] arr = list.toArray();
		for (int i = 0; i < arr.length; i++) 
			System.out.print((i%2==0) ? list.get(i)+" ": list.get(i)+"\n");
		System.out.println("\n");
	}
	
	public synchronized static PrintStrategy getInstance() {
		if(INSTANCE == null) INSTANCE = new TwoColumn();
		return INSTANCE;
	}
	
	private static PrintStrategy INSTANCE;
}
