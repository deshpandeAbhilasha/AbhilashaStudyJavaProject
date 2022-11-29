package OtherConcept;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArraylist {

	public static void main(String[] args) {
		
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		
        ArrayList<Character> al1 = new ArrayList<Character>();
		
		al1.add('A');
		al1.add('B');
		al1.add('H');
		al1.add('D');
		al1.add('E');
		
		
		Collections.sort(al);
		Collections.sort(al1);
		
		if(al.equals(al1))
		{
			System.out.println("Both arraylist has same content");
		}else {
			System.out.println("Both arraylist are not same");
		}
		

	}

}
