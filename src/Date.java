import Exception.IllegalMonthException;

public class Date {
	
	public static String getMounth(int i) throws IllegalMonthException {
		if (i==1) {
			return "january";
		}
		else if (i==2) {
			return "february";
		}
		else if (i==3) {
			return "march";
		}
		else if (i==4) {
			return "april";
		}
		else if (i==5) {
			return "may";
		}
		else if (i==6) {
			return "june";
		}
		else if (i==7) {
			return "july";
		}
		else if (i==8) {
			return "august";
		}
		else if (i==9) {
			return "september";
		}
		else if (i==10) {
			return "october";
		}
		else if (i==11) {
			return "november";
		}
		else if (i==12) {
			return "december";
		}
		throw new IllegalMonthException();
				
	}
	
	public static int getMounth(String i) throws IllegalMonthException {
		if (i.equals("january")) {
			return 1;
		}
		else if (i.equals("february")) {
			return 2;
		}
		else if (i.equals("march")) {
			return 3;
		}
		else if (i.equals("april")) {
			return 4;
		}
		else if (i.equals("may")) {
			return 5;
		}
		else if (i.equals("june")) {
			return 6;
		}
		else if (i.equals("july")) {
			return 7;
		}
		else if (i.equals("august")) {
			return 8;
		}
		else if (i.equals("september")) {
			return 9;
		}
		else if (i.equals("october")) {
			return 10;
		}
		else if (i.equals("november")) {
			return 11;
		}
		else if (i.equals("december")) {
			return 12;
		}
		throw new IllegalMonthException();
				
	}

}
