package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Find duplicate string in the array
public class DuplicatesInArray {

	public static void main(String[] args) {
		
		//Brute force
		String infra[] = {"blue" , "Pink" , "blank" , "Pink" , "yellow" , "red" , "yellow" , "blank" , "white" };
		System.out.println("Using brute force");
		
		
		
		for(int i = 0 ; i < infra.length ; i++)
		{
			for(int j = i+1 ; j <infra.length ; j++)
			{
				if(infra[i].equals(infra[j]))
				{
					System.out.println("duplicate element is " + infra[i]);
				}
			}
		}

		System.out.println("-----------------------------------------");
	
	
	//using hashset
		System.out.println("Using HashSet");
		
		Set <String> s = new HashSet<String>();
		
		for(String e : infra)
		{
			if(s.add(e) == false)
			{
				System.out.println("Duplicate element is " + e);
			}
		}
		
		
		System.out.println("-------------------------------");
		
		
		
		//using hashMap
		System.out.println("Using HashMap");
		
		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		
		
		for(String e : infra) {
			
			Integer count = infraMap.get(e);
			
			if(count == null)
			{
				infraMap.put(e , 1);
			}
			else
			{
				infraMap.put(e, ++count);
			}
		}
		
		Set <Entry <String, Integer>> entrySet = infraMap.entrySet();
		
		for(Entry<String, Integer> e : entrySet)
		{
			if(e.getValue() > 1)
			{
				System.out.println(e.getKey());
			}
		}
		
	
	}

}
