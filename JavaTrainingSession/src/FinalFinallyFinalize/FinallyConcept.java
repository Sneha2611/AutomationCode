package FinalFinallyFinalize;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}
	
	public static void test1()
	{
		try
		{
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}

	
	public static void test2()
	{
		try
		{
			System.out.println("inside test2 method");
		}
		finally
		{
			System.out.println("inside finally of test2");
		}
	}
	
	
	public static void test3()
	{
		try {
		int i=20;
		System.out.println("inside try");
		int x=i/0;
		}
		
		catch(Exception e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("execute this code even after any exception");
		}
	}
}
