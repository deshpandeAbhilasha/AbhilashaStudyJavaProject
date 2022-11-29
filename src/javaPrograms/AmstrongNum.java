package javaPrograms;

public class AmstrongNum {

	public static void main(String[] args) {
		
		//Armstrong number means every digit is multipled by length of the number and then on summation of this will return the same number
		
		
		//Find length of the number
		
		int number = 371;
		
		int length = 0;
		
		int temp = number;
		int finalNo = 0;
		
		while(number != 0) {
			
			number = number /10;
			length++;
		}
		System.out.println("The length of the number is " + length);
		
		number = temp;
		
		
		while(number !=0)
		{
			int digit = number % 10;
			number = number/10;
			int nul = 1;
			
			for(int i=0; i < length ; i++)
			{
				nul = nul * digit;
			}
			
			finalNo = finalNo + nul;
		}
		
		if(temp == finalNo) {
		
		System.out.println(finalNo + " This is Armstrong number");
		}else {
			System.out.println(finalNo + " This is Not a Armstrong number");
		}
		
	}

}
