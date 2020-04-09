package proxy;

public class ProxyImage implements Image {
    private final String filename;
    private final String data;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String data) {
        this.filename = filename;
        this.data = data;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }

	@Override
	public void showData() {
		System.out.println("Data: " + data);
	}
}
