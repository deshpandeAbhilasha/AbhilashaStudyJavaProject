package oOPsConcept;

public class ChildClass extends ParentClass{

	
	public void ParentClassMethod1()
	{
		System.out.println("Method overriden in child class");
	}
	
	public void childClassMethod()
	{
		System.out.println("child class method - original");
	}
}
