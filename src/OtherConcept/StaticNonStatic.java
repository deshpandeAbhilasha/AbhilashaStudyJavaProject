package OtherConcept;


public class StaticNonStatic {
	
	
	public static void SM() {
	//System.out.println("Static method");
		
		
	}
	
	public void NSM() {
	//	System.out.println("Not Static method");
		SM();
		System.out.println("static method can be called in non static method");
	    
	}
	
	public void NSM1() {
	//	System.out.println("Not Static method1");
		NSM();
		System.out.println("non-static method can be called in non static method");
	}

	public static void main(String[] args) {

		System.out.println("Main method");
		
		SM();
		
		System.out.println("Static method can be called in static method");
		
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.NSM();
		
		System.out.println("Non static method can be called in static method using object");
		obj.NSM1();
		
		
	}

}
