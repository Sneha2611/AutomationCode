package OOPSConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		m.sum();
		m.sum(5);
		m.sum(10, 20);

	}
	
	//we can overload main method also
	//you cannot create a method inside a method
	//duplicate methods i.e same method name with same no of arguments is not allowed
	
	//method overloading - when method name is same with different arguments or input parameters within the same class
	
	public void sum()
	{
		System.out.println("no input parameters");
	}
	
	public void sum(int x)
	{
		System.out.println("one input parameters");
		System.out.println(x);
	}

	public void sum(int x,int y)
	{
		System.out.println("two input parameters");
		System.out.println(x+y);
	}
}
