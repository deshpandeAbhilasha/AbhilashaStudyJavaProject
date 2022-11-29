package javaPrograms;

public class IsPrime {

	
	public static void main(String[] args) {
		
		
		int number = 111;
		int temp = 0;
	
			for(int i = 2 ; i < number ; i++)
			{
				int quotient = number % i;
				
				if(quotient == 0)
				{
					temp++;
					System.out.println("Value of i is " + i);
					break;
					
				}	
			
		    }
			if(temp == 0) {
				System.out.println(number + " is prime number");
			}else
			{
				System.out.println(number + " is not a prime number");
			}
	}

}
