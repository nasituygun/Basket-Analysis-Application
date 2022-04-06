package Products;

public class Headphone extends Electronic{
	
	private int bluetoothVersion;

	public Headphone(String productID, String title, int bluetoothVersion) {
		super(productID, title);
		this.bluetoothVersion = bluetoothVersion;
	}

	public int getBluetoothVersion() {
		return bluetoothVersion;
	}
	
	public String toString() {
		return getProductID()+" "+getTitle()+" "+getBluetoothVersion();
	}
}
