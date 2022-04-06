package Products;
public abstract class Cosmetic extends Product {
	

	private String brand;
	private int ml;
	
	
	
	public Cosmetic(String productID, String brand, int ml) {
		super(productID);
		this.brand = brand;
		this.ml = ml;
	}

	public int getML() {
		return ml;
	}

	public String getBrand() {
		return brand;
	}

}
