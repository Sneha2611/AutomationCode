package JavaBasics;

public class B extends A {

	/*
	 * super() is used to call the immediate parent. super() can be used with
	 * instance members, i.e., instance variables and instance methods. super() can
	 * be used within a constructor to call the constructor of the parent class
	 */
	
	
	public B()
	{
		super();
		System.out.println("child class constructor");
	}
	
	public B(int i)
	{
		super(i);
		
	}
	
	public B(int i,int j)
	{
		super(i,j);
	}
	
	public static void main(String args[])
	{
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(50,60);
	}
}
