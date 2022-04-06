package Products;

public class Coat extends Clothing{
	
	private String coatType;

	public Coat(String productID, String brand,String size,String coatType) {
		super(productID, brand, size);
		this.coatType = coatType;
	}

	public String getCoatType() {
		return coatType;
	}
	
	public String toString() {
		return getProductID()+" "+getBrand()+" "+getSize()+" "+getCoatType();
	}



}
