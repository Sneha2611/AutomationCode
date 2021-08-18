package JavaBasics;

public class ConstructorWithThisKeyword {

	//this keyword is used to initialize the class variables in the constructor
	//whenever you want to initialize the global variable with the current value of constructor this keyword is used
	
	//class variables/global variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConstructorWithThisKeyword c = new ConstructorWithThisKeyword("sneha", 30);

	}

}
