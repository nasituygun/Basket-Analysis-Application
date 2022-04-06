package FileIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import Basket.Baskets;
import Products.*;


public class FileIO {
	
	List<String> aList;
	ArrayList<Product> productList;
	public FileIO() {
		productList=new ArrayList<Product>();

		
		
	}
	
	public void readFile(String fileName) throws IOException {
		aList=new ArrayList<String>();
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((line=br.readLine()) != null) {
				aList.add(line);
				}
			}
		
	}




	public ArrayList<Product> initializeProductList(String fileName) throws Exception{
		readFile(fileName);
		for (int i=0;i<aList.size();i++) {
			String data[]=aList.get(i).split(";");
			switch (data[0].substring(2,4)){
			case "PC":
				productList.add(new PC(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4]));
				break;
			case "MO":
				productList.add(new Monitor(data[0],data[1],Double.parseDouble(data[2].replace(",", "."))));
				break;
			case "PH":
				productList.add(new Phone(data[0],data[1],Integer.parseInt(data[2])));
				break;
			case "HE":
				productList.add(new Headphone(data[0],data[1],Integer.parseInt(data[2])));
				break;
			case "CO":
				productList.add(new Coat(data[0],data[1],data[2],data[3]));
				break;
			case "SK":
				productList.add(new Skirt(data[0],data[1],data[2],data[3]));
				break;
			case "PE":
				productList.add(new Perfume(data[0],data[1],Integer.parseInt(data[2]),data[3]));
				break;
			case "LI":
				productList.add(new Lipstick(data[0],data[1],Integer.parseInt(data[2]),data[3],data[4]));
				break;
			
			default:
				throw new IllegalArgumentException();
			}
			 
			
		}
		
		return  productList;
		
	}

	public ArrayList<Baskets> initializeBasketList(String fileName) throws NumberFormatException, ParseException, IOException{
		readFile(fileName);
		ArrayList<Baskets> basketList=new ArrayList<Baskets>();
		
		for (int i=0;i<aList.size();i++) {
			String data[]=aList.get(i).split(";");
			basketList.add(new Baskets(Integer.parseInt(data[0]),data[data.length-1]));
			for (int j=1;j<data.length-1;j=j+3) {
				Product p=getProductObject(data[j]);
				basketList.get(i).addSold(p, Integer.parseInt(data[j+1]), Integer.parseInt(data[j+2]));
				p.setPrice(data[data.length-1], Integer.parseInt(data[j+1]));
				p.addQuantity(Integer.parseInt(data[j+2]));
				p.addRevenue(Integer.parseInt(data[j+1]));
			}
		
	}
		return basketList;

	}

	private Product getProductObject(final String id) {
		for (Product p:productList) {
			if (id.equals(p.getProductId())){
				return p;
			}
				
		}
		return null;
		
	}
}
