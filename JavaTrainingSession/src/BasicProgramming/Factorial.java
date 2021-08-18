package BasicProgramming;

public class Factorial {
	
	//using for loop
	public void isFactorial(int n)
	{
		int fact = 1;
		
		
		for(int i=1 ; i<=n ; i++)
		{
			fact = fact *i;
		}
		
		System.out.println(fact);
	}
	
	
	//using recursion
	
	public int factRecur(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n * factRecur(n-1));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f = new Factorial();
		//f.isFactorial(0);
		System.out.println(f.factRecur(0));
	}

}
