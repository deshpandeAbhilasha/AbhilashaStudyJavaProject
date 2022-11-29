package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "abcdefghijklmnopqrstuvwxyz";
		int length = name.length();
		
		String rev = "";
		
		for(int i = (length-1) ; i >=0 ; i--)
		{
			rev = rev + name.charAt(i);
		}

	//	System.out.println(rev);
		
		
		
		System.out.println("Reverse number");
		
		int number = 24355640;
		
		int temp =  number;
		int revNo = 0;
		
		while(number != 0)
		{
			
			temp = number % 10;
			number = number /10;
			revNo = revNo*10 + temp ;
			
		}
		
		System.out.println("reverse number is " + revNo);
	}

}
