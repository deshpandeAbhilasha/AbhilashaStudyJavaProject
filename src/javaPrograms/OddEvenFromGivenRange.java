package javaPrograms;

public class OddEvenFromGivenRange {

	public static void main(String[] args) {
		//Find the count of even or odd numbers present in given range
		
		int number[] = {10, 11, 12, 13,14, 15, 16, 17, 18, 19, 20,30,40,41, 42, 43, 44, 45, 56, 67, 50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
		int Evencount =0 ;
		int Oddcount= 0;
		//int count[5];
		
		for(int i = 0; i<number.length ; i++)
		{
			if(number[i]%2 ==0)
			{
				Evencount++;
				/*for(int j=0 ; j<=4 ;j++)
				{
			//		count[j]=number[i];
*/					
				//}
				
			}else {
				Oddcount++;
				System.out.println(number[i] + "  ");
			}
		}
		System.out.println("Odd number in the provided range" + Oddcount);
		
		System.out.println("Even number in the provided range" + Evencount);
		
		
		

	}

}
