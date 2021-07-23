package week1.day2;

public class LeapYear {

	public static void main(String[] args) {
	
		int y = 2000;
		 if(y % 400 == 0 && y % 4 == 0) {
			 System.out.println("Leap year");
		 }
		 else {
			 if(y % 100 == 0)
				 System.out.println("NOT LEAP YEAR");
		 }
		 }
		

	}


