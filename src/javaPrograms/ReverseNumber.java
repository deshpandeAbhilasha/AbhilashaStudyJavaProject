package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		
		int number = 18976546;
		
		int revNum = 0;
		
		while(number !=0)
		{
			int temp = number % 10;
			
			revNum = revNum *10 + temp;
			number = number/10;
		}
		System.out.println(revNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
