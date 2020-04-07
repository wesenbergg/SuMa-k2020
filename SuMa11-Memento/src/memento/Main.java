package memento;

public class Main {

	public static void main(String[] args) {
		int n = 4; // Number of threads 
        for (int i=1; i<=n; i++) 
        { 
        	Arvuri arvuri = new Arvuri(i+"");
            Thread object = new Thread(arvuri); 
            Arvuuttaja.getInstance().liityPeliin(arvuri);
            object.start(); 
        }
	}
}
