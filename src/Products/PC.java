package Products;

public class PC extends Electronic {
	private int ramCapacity,ssdCapacity;
	private String cpu;
	




	public PC(String productID, String title, int ramCapacity, int ssdCapacity, String cpu) {
		super(productID, title);
		this.ramCapacity = ramCapacity;
		this.ssdCapacity = ssdCapacity;
		this.cpu = cpu;
	}



	public int getSsdCapacity() {
		return ssdCapacity;
	}



	public String getCpu() {
		return cpu;
	}



	public int getRamCapacity() {
		return ramCapacity;
	}
	
	public String toString() {
		return getProductID()+" "+getTitle()+" "+getRamCapacity()+" "+getSsdCapacity()+" "+getCpu() ;
	}

}
