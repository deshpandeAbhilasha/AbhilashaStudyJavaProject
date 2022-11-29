package OtherConcept;

import java.util.ArrayList;

public class ThisKeyword {
	
	String name;
	int age;
	ArrayList <String> features;
	
	
	public ThisKeyword()
	{
		
	}
	
	public ThisKeyword(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	public ThisKeyword(String name, int age , ArrayList<String>feature)
	{
		this.name = name;
		this.age = age;
		this.features = feature;
		
	}
	
	public static void main(String a[])
	{
	   ThisKeyword obj = new ThisKeyword("Abhilasha" , 20);
	   System.out.println("Object 1");
	   System.out.println( obj.name) ;
		 System.out.println( obj.age);	
	   ArrayList <String> feature = new ArrayList<String>();
	   feature.add("Agiliad");
	   feature.add("KD high school");
	   feature.add("BN college");
	   feature.add("Coaching classes");
	   System.out.println("Object 2");
	   ThisKeyword obj2 = new ThisKeyword("Aboli" , 22 , feature);
	   
//	   for(String e : feature)
//	   {
//		   System.out.println(e);
//	   }
	   
//	   for(int i=0 ; i < feature.size() ; i++)
//	   {
//		   System.out.println(feature.get(i));
//	   }
	  System.out.println( obj2.features);
	 
	 
	}



}

