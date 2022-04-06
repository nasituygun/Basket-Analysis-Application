import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import Basket.Baskets;
import Basket.IBasket;
import Exception.IllegalMonthException;
import FileIO.FileIO;
import Products.Product;


public class App {
	
	ArrayList<Product> productList;
	ArrayList<Baskets> basketList;
	
	public void run() throws Exception {
	productList=new ArrayList<Product>();
	basketList=new ArrayList<Baskets>();
	
	FileIO f=new FileIO();
	productList=f.initializeProductList("products.csv");
	basketList=f.initializeBasketList("baskets.csv");
	}
	
	
	public void printRevenueColi1() {
		for (Product p: productList ) {
			if (p.getProductId().equals("COLI-1")) {
				System.out.println(p.getRevenue());
			}
		}
		

		
		
	}
	public void printTopSelling() {
		Collections.sort(productList);
		System.out.println(productList.get(productList.size()-1).toString());
		

}
	public void printMostPaidBasket() {
		Collections.sort(basketList);
		System.out.println(basketList.get(basketList.size()-1).toString());
	}
	
	
	public void printMostDifferentProduct() {
		IBasket max=basketList.get(0);
		for (IBasket b:basketList) {
			if (max.getDifferentProductNumber()<b.getDifferentProductNumber()) {
				max=b;
			}
			
		}
		System.out.println(max.toString());
	}
	
	public void printMostExpensiveMonthELPC1() throws IllegalMonthException {
		for (Product p: productList ) {
			if (p.getProductId().equals("ELPC-1")) {
				System.out.println(Date.getMounth(p.getMaxPriceMonth()));
			}
	}
}
	
	public void printIncreaseRateELHE2inJuly() {
		for (Product p: productList ) {
			if (p.getProductId().equals("ELHE-2")) {
				System.out.println("%"+new DecimalFormat("####0.00").format(p.getMountlyIncreaseRate(7)));


		}
	}
}
}



