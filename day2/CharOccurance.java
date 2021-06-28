package week1.day2;

public class CharOccurance {
	
	public static void main(String[] args) {
	int count[] = new int[256];
	String str = "welcome to chennai ";
	int find = 0;
	int length = str.length();
	 
	
	char ch[] = new char[str.length()];
	for (int i = 0; i < length; i++)
		count[str.charAt(i)]++;
	{
		int i = 0;
		ch[i] = str.charAt(i);
		for (int j = 0; j <= i; j++) {
			if (str.charAt(i) == ch[j])
				find++;
		}
		if (find == 1) 
			System.out.println("number of occurance of" + str.charAt(i) + " is:" + count[str.charAt(i)]);
		
		
		// TODO Auto-generated method stub

	}

	}
}
