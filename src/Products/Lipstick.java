package Products;

public class Lipstick extends Cosmetic {
	
	private String lipstickType,color;

	public Lipstick(String productID, String brand, int ml, String lipstickType, String color) {
		super(productID, brand, ml);
		this.lipstickType = lipstickType;
		this.color = color;
	}

	public String getLipstickType() {
		return lipstickType;
	}

	public String getColor() {
		return color;
	}
	
	
	public String toString() {
		return getProductID()+" "+getBrand()+" "+getML()+" "+getLipstickType()+" "+getColor();
	}

}
