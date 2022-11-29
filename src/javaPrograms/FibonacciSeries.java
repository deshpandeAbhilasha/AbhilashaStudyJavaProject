package javaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		
		// fibonacci series = 0 , 1, 1, 2, 3, 5, 8, 13....
		
		//print series upto 100
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=0; i <=100 ; i++)
		{
			
			int c = a+b;
			a = b;
			b = c;
			System.out.print( " " + c);
		}
		
		
		
		
		
		
		
		
		
	}

}
