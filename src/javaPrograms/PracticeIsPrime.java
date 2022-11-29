package javaPrograms;

public class PracticeIsPrime {

	
	public static void IsPrime(int number)
	{
		int temp = 0;
		int temp1 = number;
		int quotient = 1;
		int isprime = 0;
		
		for(int i = 2 ; i < number; i++)
		{
			quotient = number % i;
			
			if(quotient ==0)
			{
				isprime++;
				break;
			}
		}
		if(isprime == 1)
		{
			System.out.println("Given number is prime " );
		}else {
			System.out.println("Given number is not prime ");
		}
	}
	
	
	public static void main(String a[])
	{
		IsPrime(343);
		
		
	}
}
