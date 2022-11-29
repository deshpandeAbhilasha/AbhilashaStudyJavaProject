package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(90,10 , 20 , 50, 20,40, 40, 10, 30,  30 , 40 ));
		
		LinkedHashSet<Integer> removedDuplicates = new LinkedHashSet<Integer>(numbers);
		
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(removedDuplicates);
		
		System.out.println(numbers1);
		
		System.out.println("========================================");
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(10 , 20 , 40, 20,40, 40, 10, 30,  30 ,70,90,110, 40 ));
		
		
		
		List<Integer> removedDuplicates2 =  numbers2.stream().distinct().collect(Collectors.toList());
		
		System.out.println(removedDuplicates2);
		
		
		System.out.println(numbers1);
		
		numbers1.removeAll(numbers2);
		
		
		
		
		
		
		
		

	}

}
