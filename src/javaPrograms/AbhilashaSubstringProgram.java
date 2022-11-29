package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class AbhilashaSubstringProgram {
	static int overllStringlength = 0;

	public static void main(String[] args) {
	
		String input = "abcdeaaabcdefghiabdcdere";
		
		System.out.println(input.length());
		
		Set<Character>set = new HashSet<Character>();
		
		String finalString = "";
		
		char[] inputArray = input.toCharArray();
		
		for(int i=0; i<input.length();i++)
		{
			
			if(set.contains(inputArray[i]))
			{
				lengthOfString(finalString);
				set.clear();
				finalString="";
				
			}else {
				finalString = finalString+inputArray[i];
		//		System.out.println(finalString);
				set.add(inputArray[i]);
					
			}
		}
		
		
		
	//	System.out.println(finalString);

	}
	public static void lengthOfString(String finalString)
	{
		if(finalString.length() > overllStringlength)
		{ 
			overllStringlength = finalString.length();
			System.out.println(finalString);
			
		}
	}

}
