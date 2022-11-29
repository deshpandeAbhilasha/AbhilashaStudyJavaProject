package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromArray {

	public static void main(String[] args) {
		
		
		String[] input = new String[] {"abcde" ,"sssssss" , "sssssss" , "sdfsfdsfse" , "abcdefefe" , "sdfsferwr" , "abcde" , "fasfdsfsfsfa" , "abcdefefe" , "abcdefefe"};
		
		Set<String>set = new HashSet<String>();
		Set<String> duplicateStrings = new HashSet<String>();
		
		for(String e : input)
		{
			if(set.add(e) == false)
			{
				duplicateStrings.add(e);
				
			}else
			{
				set.add(e);
			}
		}
		
		System.out.println(duplicateStrings);

	}

}
