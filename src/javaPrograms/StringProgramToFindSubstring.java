package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringProgramToFindSubstring {

	public static void main(String[] args) {
		
		
		String s = "Thisismyfirstjavaprogram";
		
		Set<Character> set = new HashSet<Character>();
		List<String>list = new ArrayList<String>();
		
		
		String temp = "";
		
		for(int i =0; i<s.length() ; i++)
		{ 
			
			if(set.add(s.charAt(i))== true)
			{
				
				set.add(s.charAt(i));
				temp = temp+ s.charAt(i);
					
				
			}else {
				//List<String>list1 = new ArrayList<String>();
				list.add(temp);
				temp = "";
				set.clear();
				
				
			}
			
			
		}
		
		
		System.out.println(list);
		ArrayList<Integer> lengthArray = new ArrayList<Integer>();
		for(String a : list)
		{
			int length = a.length();
		 
			
			lengthArray.add(length);
			
		   
			
		}
		 System.out.println(lengthArray);
		
		
		

	}

}
