package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "PayPal India";
       char[] charArray = str.toCharArray();
       Set<Character> ch = new LinkedHashSet<Character>();
       for (Character eachchar : charArray) {
    	   if(eachchar !=' ')
    		 ch.add(eachchar);
       }
       System.out.println(ch);
		
	}
	}


