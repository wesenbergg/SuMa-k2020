package prototype;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		Kello kello = new Kello();
		kello.asetaViisarit(23, 59, 59);
		Kello kopio = kello.clone();
		
		for (int i = 0; i < 5; i++) {//Kasvatetaan alkuperäisen olion arvoa 5:llä sekunnilla
			try {
				System.out.println(kello);
				kello.tikitaKelloa();
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) { }
		}
		
		
		for (int i = 0; i < 5; i++) {//Kasvatetaan kopio olion arvoa 5:llä sekunnilla
			try {
				System.out.println(kopio);
				kopio.tikitaKelloa();
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) { }
		}
	}
}
