package Products;
public abstract 
class Electronic extends Product {
	

	private String title;
	
	public Electronic(String productID, String title) {
		super(productID);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	

}
