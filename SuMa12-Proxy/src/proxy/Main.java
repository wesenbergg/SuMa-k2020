package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Image> imageList = new ArrayList<>();
        imageList.add(new ProxyImage("Dali_Atomicus_1948", "Dalí Atomicus, photo by Philippe Halsman (1948), shown before support wires were removed from the image"));
        imageList.add(new ProxyImage("The_Falling_Soldier_1936", "Original title Loyalist Militiaman at the Moment of Death, Cerro Muriano, September 5, 1936"));
        imageList.add(new ProxyImage("The_Seven_Year_Itch", "Monroe posing for photographers while filming the subway grate scene for The Seven Year Itch in September 1954"));
        imageList.add(new ProxyImage("Robert_Mapplethorpe", "Self portrait (1980)"));
        
        System.out.println("Show data");
        for (Image image : imageList) {
			image.showData();
		}
        
        System.out.println("\nLoad & display images");
        for (Image image : imageList) {
			image.displayImage();
		}
	}

}