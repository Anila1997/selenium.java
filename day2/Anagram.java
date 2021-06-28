package week1.day2;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) {
			System.out.println("Both are the strings are not anagram");
		}
		else {
			char[] String1 = str1.toCharArray();
			char[] String2 = str2.toCharArray();
	    
	     Arrays.sort(String1);
	     Arrays.sort(String2);
	     if(Arrays.equals(String1,String2) == true) {
	    	 System.out.println("Both strings are anagram");
	     }
	     else {
	    	 System.out.println("Both strings are not anagram");
	     }
		}
		

	}

}
