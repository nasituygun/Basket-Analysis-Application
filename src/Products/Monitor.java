package Products;

public class Monitor extends Electronic{
	private double screenSize;

	public Monitor(String productID, String title, double screenSize) {
		super(productID, title);
		this.screenSize = screenSize;
	}

	public double getScreenSize() {
		return screenSize;
	}

	@Override
	public String toString() {
		return getProductID()+" "+getTitle()+" "+getScreenSize();
	}

	
	
	
	

}
