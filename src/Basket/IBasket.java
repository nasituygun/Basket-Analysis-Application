package Basket;
import Products.IProduct;

public interface IBasket {

	void addSold(IProduct item, int price, int quantity);

	void addRevenue(int price, int quantity);

	int compareTo(IBasket o);

	int getDifferentProductNumber();


	int getRevenue();
}