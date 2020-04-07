package memento;

public class Main {

	public static void main(String[] args) {
		int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
        	Arvuri arvuri = new Arvuri(i+"");
            Thread object = new Thread(arvuri); 
            Arvuuttaja.getInstance().liityPeliin(arvuri);
            object.start(); 
        }
	}
}
