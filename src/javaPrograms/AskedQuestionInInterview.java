package javaPrograms;



public class AskedQuestionInInterview {

	public static void main(String[] args) {
		
		
		// Input  = "this is my name abhilasha
		
		// output = "This Is My Name Abhilasha
		
		String GivenString = "this is my name abhilasha";
		
		String[] splitArray = GivenString.split(" ");
				
		String finalString = "";
		for(String b : splitArray)
		{
			int length1 = b.length();

			String a = b.substring(0,1).toUpperCase() + b.substring(1, length1);
	
			finalString = finalString + " " + a;
			
		}
		System.out.println(finalString.trim());

					
				}
			
		}
		
		
		
		

	


