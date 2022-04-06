package Products;

public interface IProduct {

	void addQuantity(int quantity);

	double getMountlyIncreaseRate(int month);

	int compareTo(IProduct o);

	void addRevenue(int revenue);

	int getMaxPriceMonth();

	int getQuantity();

}