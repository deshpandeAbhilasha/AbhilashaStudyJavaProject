package javaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseStringButnotDigit {

	public static void main(String[] args) {
		
		String a = "Testing10is90my80Passion";
		
		String [] splitArray = a.split("\\d");
		
		for(String b : splitArray)
		{
			System.out.print(b);
		}

		
//		for(int i=0 ; i < a.length() ; i++)
//		{
//			while(Character.isAlphabetic(i))
//			{
//				
//			}
//		}
//		
		
		
		
		
//		Pattern pt = Pattern.compile("\\d");
//		
//		Matcher mt = pt.matcher(a);
//		
//	//	System.out.println(mt.find());
//		
//		while(mt.find())
//		{
//			System.out.println(mt.group());
//		}
//		
		
		
		
		
		
		
	}

}
