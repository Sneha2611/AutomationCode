package JavaBasics;

public class ConstructorConcept {
	//constructor is an entity which is used to define class features while creating object
	//purpose of constructor is to initialize the object of the class
	

	public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("parameterized constructor with 1 param");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i , int j)
	{
		System.out.println("parameterized constructor with 2 params");
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept c1 =  new ConstructorConcept();
		ConstructorConcept c2 =new ConstructorConcept(5);
		ConstructorConcept c3 = new ConstructorConcept(10,20);
		
		
		
	}

}
