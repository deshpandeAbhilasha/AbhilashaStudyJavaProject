package javaPrograms;

// Find length of a number

public class FindLength {

	public static void main(String[] args) {
		
      int number = 1009090000;
      
      int length = 0;
      int temp = number;
      
      while(number != 0)
      {
    	  number = number/10;
    	  length++;
    	  
      }
      System.out.println(length);
      
	}

}
