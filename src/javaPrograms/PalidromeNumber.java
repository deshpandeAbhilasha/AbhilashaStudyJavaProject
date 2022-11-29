package javaPrograms;

public class PalidromeNumber {

	public static void main(String[] args) {
	
		
		// A number when read from right or left it remain same
		
		int number = 16461;
		int temp1 = number;
		
		int revNo = 0;
		
		while(number !=0) {
			
			int temp = number % 10;
			revNo = revNo *10 + temp;
			number = number /10;
			
		}
		
		if(temp1 == revNo) {
			System.out.println("The number " + temp1 + " is palidrome number" );
		}else
		{
			System.out.println("The number " + temp1 + " is not a palidrome number");
		}
		
		
		
		
		
		
		
		

	}

}
