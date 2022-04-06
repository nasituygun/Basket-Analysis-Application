package Products;
import java.util.ArrayList;
import java.util.HashMap;



public abstract class Product implements Comparable<IProduct>, IProduct {
	
	private String productID;
	private HashMap<String, Integer> price;
	private int quantity=0;
	private int revenue=0;


	public Product(String productID) {
		this.setProductID(productID);
		price = new HashMap<String, Integer>();
	}
	
	
	
	public void setPrice(String month,Integer price) {
		this.price.put(month, price);
	}
	public Integer getPrice(String date) {
		return price.get(date);
	}
	
	public String getProductId() {
		return getProductID();
	}
	
	@Override
	public void addQuantity(int quantity) {
		this.quantity=quantity+this.quantity;
	}
	
	
	@Override
	public double getMountlyIncreaseRate(int month) {
		double increaseRate = 0;
		ArrayList<Integer> priceList=new ArrayList<Integer>();
		for(String s: price.keySet()) {
			if((Integer.parseInt(s.split("\\.")[1]))==month) {
				
				priceList.add(getPrice(s));
			}
			
			
		}
		int max=1,min=99999;
		for (Integer i:priceList ) {
			if (i>max) {
				max=i;
			}
			if (i<min) {
				min=i;
			}
			
		}
		increaseRate=((max-min)/(double)max)*100;
		return increaseRate;
	}



	@Override
	public int compareTo(IProduct o) {
	
		return this.quantity > o.getQuantity() ? 1 : this.quantity < o.getQuantity() ? -1 : 0;

		
	}
	
	@Override
	public void addRevenue(int revenue) {
		this.revenue=revenue+this.revenue;
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	public int getQuantity() {
		return quantity;
	}



	public String getProductID() {
		return productID;
	}



	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	
	
	
	@Override
	public int getMaxPriceMonth () {
		int maxPrice = 0;
		String date = null;
		for(String s: price.keySet()) {
			if(maxPrice<price.get(s)) {
				maxPrice=price.get(s);
				date=s;
			}
			
			}
		return ((Integer.parseInt(date.split("\\.")[1])));
		}
	
	
	public abstract String toString();

	
	
	

}
