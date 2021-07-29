package week6.day2;

public class CharOccuranceUsingReplace {

	public static void main(String[] args) {
		String str = "welcome to chennai ";
		int len = str.length();
		String rep = str.replace("e", "");
		int length = rep.length();
		
		int result = len - length;
			
		
       
		System.out.println(result);
	}	

	
}
