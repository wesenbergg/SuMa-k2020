package strategy;

import java.util.Iterator;
import java.util.List;

public class ThreeColumn implements PrintStrategy {

	private ThreeColumn() { }
	
	@Override
	public void printItems(List<String> list) {
		int c = 1;
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print((c%3 == 0) ? iterator.next()+"\n": iterator.next()+" ");
			c++;
		}
		System.out.println("\n");
	}

	public synchronized static PrintStrategy getInstance() {
		if(INSTANCE == null) INSTANCE = new ThreeColumn();
		return INSTANCE;
	}
	
	private static PrintStrategy INSTANCE;
}
