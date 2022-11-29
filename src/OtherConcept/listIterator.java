package OtherConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		
		list.add(100);
		list.add(300);
		
		list.add(800);
		
		list.add(900);
		
		ListIterator Litr = list.listIterator();
		
		System.out.println(list);
		
		Litr.next();
		
		Litr.set(400);

		System.out.println(list);
	}

}
