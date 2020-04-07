package chain;

public class Main {
	public static void main(String[] args) {
		Palkankorotus pekanKorotus = new Palkankorotus("Pekka", 1);
		Palkankorotus teponKorotus = new Palkankorotus("Teppo", 4);
		Palkankorotus matinKorotus = new Palkankorotus("Matti", 10);
		
		Toimitusjohtaja tj = new Toimitusjohtaja();
		Päällikkö päle = new Päällikkö();
		Esimies em = new Esimies();
		
		em.setSeuraaja(päle);
		päle.setSeuraaja(tj);
		
		try {
			em.kasitteleKorotus(pekanKorotus);
			em.kasitteleKorotus(teponKorotus);
			em.kasitteleKorotus(matinKorotus);
		}catch(Exception e) {
			System.out.println("Kappas vain");
		}
	}
}
