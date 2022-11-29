package javaPrograms;

public class Factorial {

	public static void main(String[] args) {
		// factorial means = 5! = 5*4*3*2*1
		
		
		int num = 6;
		//int temp = num;
		int fact = 1;
		
		System.out.println("Using for loop");
		
		for(int i = 2; i <= num ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		
		
		System.out.println("Using while loop");
		
		int num1 = 6;
		int temp1 = num1;
		int fact1 = 1;
		
		while(num1 != 0)
		{
			fact1 = fact1 * num1;
			num1--;
		}
		
		System.out.println("The factorial of " + temp1 + " is " + fact1);

	}

}
