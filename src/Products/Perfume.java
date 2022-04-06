package Products;

public class Perfume extends Cosmetic {
	private String fragranceType;

	public Perfume(String productID, String brand, int ml, String fragranceType) {
		super(productID, brand, ml);
		this.fragranceType = fragranceType;
	}

	public String getFragranceType() {
		return fragranceType;
	}
	
	public String toString() {
		return getProductID()+" "+getBrand()+" "+getML()+" "+getFragranceType();
	}
}
