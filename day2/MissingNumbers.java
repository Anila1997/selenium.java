package week1.day2;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
	
	    
	       int[] arr = {1,2,3,4,7,6,8};
	      
	        Arrays.sort(arr);
	       
	        System.out.println("Missing Number is");
	       
	        
	      
	           for (int j = 0; j < arr.length; j++) {
	            System.out.println("j :" +j);
	            System.out.println("[j-1]: " + (j-1));
	            System.out.println("arr[j-1]: " +arr[j-1]);
	            
	          
	       
	            
	            if(j != arr[j-1]) {
	                System.out.println(j);
	               
	            }
	            else
	            	break;
	            }

	}

}
