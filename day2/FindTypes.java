package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ welcome to 2nd class of Automation $$";
		count (test);
		     }

	private static void count(String x) {
		// TODO Auto-generated method stub
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		for(int i =0; i<x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter ++;
		     }
			else if(Character.isDigit(ch[i])) {
				num ++;
			}
			else if(Character.isSpaceChar(ch[i])) 
				space++;
		
		else {
			specialChar ++;
		}
		}
			
		System.out.println("$$ welcome to 2nd class of Automation $$");		
		System.out.println("letter:" + letter);	
		System.out.println("space: "+ space);
		System.out.println("num: "+ num);
		System.out.println("secialChar: "+ specialChar);
	}

}
