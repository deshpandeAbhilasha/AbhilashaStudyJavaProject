package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		
		
		String a = "yuiwyrerwwwwwwwwwwweeeeeeeeeeeeeeeee";
		
		char array[] = a.toCharArray();
		
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		
		for(Character ch : array)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch) +  1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		// To print values
		
		Set <Entry <Character, Integer>> set  = map.entrySet();
		
		for(Map.Entry <Character , Integer> map1 : set)
		{
			if(map1.getValue() > 1)
			{
				System.out.println("Print duplicate characters " + map1.getKey());
			}
		}
		System.out.println(9.0/0);
		System.out.println(0.0/0.0);
		System.out.println("not terminated");

	}

}
