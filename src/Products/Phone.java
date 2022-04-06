package Products;

public class Phone extends Electronic {
	
	private int memoryCapacity;
	
	public Phone(String productID, String title, int memoryCapacity) {
		super(productID, title);
		this.memoryCapacity = memoryCapacity;
	}

	public int getMemoryCapacity() {
		return memoryCapacity;
	}
	
	public String toString() {
		return getProductID()+" "+getTitle()+" "+getMemoryCapacity();
		
	}

	

}
