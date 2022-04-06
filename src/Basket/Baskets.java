package Basket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import Products.IProduct;

public class Baskets implements Comparable<IBasket>, IBasket {
	private int basketID;
	private ArrayList<Sold> soldList;
	private String date;
	private int revenue;

	
	public Baskets(int basketID, String date) {
		soldList=new ArrayList<Sold>();
		this.basketID = basketID;
		this.date = date;
	}


	private class Sold implements Comparable<Sold>{
		private IProduct item;
		private int price;
		private int quantity;
		public Sold(IProduct item, int price, int quantity) {
			this.item = item;
			this.price = price;
			this.quantity = quantity;
		}
		public IProduct getItem() {
			return item;
		}

		@SuppressWarnings("unused")
		public int getPrice() {
			return price;
		}
		public int getQuantity() {
			return quantity;
		}
		
		
		
		@Override
		public int compareTo(Baskets.Sold o) {
			return this.quantity > o.getQuantity() ? 1 : this.quantity < o.quantity ? -1 : 0;

		}
		
		
		
	}
	
	public int getId() {
		return basketID;
	}
	
	@Override
	public void addSold(IProduct item, int price, int quantity) {
		soldList.add(new Sold(item,price,quantity) );
		addRevenue(price,quantity);
	}
	
	@Override
	public void addRevenue(int price,int quantity) {
		revenue=revenue+(price*quantity);
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	
	public IProduct getTopSold() {
		Collections.sort(soldList);
		Collections.reverse(soldList);
		for (Sold s:soldList) {
			System.out.println(((Products.Product) s.getItem()).getProductId());
		}
		return soldList.get(0).getItem();
	}

	@Override
	public int compareTo(IBasket o) {
		return this.revenue > o.getRevenue() ? 1 : this.revenue < o.getRevenue() ? -1 : 0;
	}
	
	
	public String toString() {
		return "basket"+" "+basketID;
	}
	
	@Override
	public int getDifferentProductNumber() {
		Set<IProduct> set=new HashSet<IProduct>();
		for (Sold s:soldList) {
			set.add(s.getItem());
			
		}
		return set.size();
	}

	public String getDate() {
		return date;
	}




		
}


