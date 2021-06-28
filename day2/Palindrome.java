package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String chr = "madam";
		String  rev = "";
		int length = chr.length();
		
		for ( int i = length-1; i >-1; i--) {
			rev = rev + chr.charAt(i);
		}
		{
			if(chr.equals(rev)) {
				System.out.println("the string is palindrome");
			}
			else
			{
				System.out.println("the string is not palindrome");
		}
		// TODO Auto-generated method stub

	}

	}
}
