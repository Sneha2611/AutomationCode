package OOPSConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava f = new FunctionsInJava();
		f.test();
		int d =f.test1();
		System.out.println(d);
		
		String j = f.test2();
		System.out.println(j);
		
		int sum = f.test3(10, 30);
		System.out.println(sum);

	}

	//non static methods
	
	//return type - void
	public void test()		//no input no output
	{
		System.out.println("test method");
	}
	
	//return type - int
	public int test1()		//no input some output
	{
		System.out.println("test1 method");
		int a=20;
		int b= 60;
		int c=30;
		
		return b;
	}
	
	//return type - string
	public String test2()		//no input some output
	{
		System.out.println("test2 method");
		String s = "sneha";
				
		return s;
	}
	
	
	public int test3(int x,int y) //some input some output
	{
		System.out.println("test3 method");
		int c=x+y;
		
		return c;
		
	}
	
	
}
