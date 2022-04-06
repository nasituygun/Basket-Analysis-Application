package Products;
public abstract class Clothing extends Product{
	private String brand;
	private String size;

	public Clothing(String productID, String brand, String size) {
		super(productID);
		this.brand = brand;
		this.size=size;
		}

	public String getBrand() {
		return brand;
	}

	public String getSize() {
		return size;
	}



	
	}


	


