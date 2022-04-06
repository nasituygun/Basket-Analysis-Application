package Products;

public class Skirt extends Clothing {
	private String hemline;

	public Skirt(String productID, String brand, String size, String hemline) {
		super(productID, brand, size);
		this.hemline = hemline;
	}

	public String getHemline() {
		return hemline;
	}
	
	public String toString() {
		return getProductID()+" "+getBrand()+" "+getSize()+" "+getHemline();
	}

}
