package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeme";
		StringBuffer updatedString  = new StringBuffer();
		char[] characters = str.toCharArray();
		for(int index = 0; index < characters.length; index++) {
		char c = characters[index];
		if( index % 2 != 0) {
			c = Character.toUpperCase(c);
		}
		updatedString.append(c);
		}
		System.out.println("Modified string is: " + updatedString.toString());	
		
		}
		// TODO Auto-generated method stub

	}


