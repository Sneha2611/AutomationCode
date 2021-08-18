
public class BasicProgramming {

	
	public static boolean isPrime(int num)
	{
		
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num ;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
	return true;	
	}
	
	
	public static void getPrime(int num)
	{
		for(int i =2; i<=num ;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(-2));
		getPrime(20);
//		int num=0;
//		
//		
//		if(num%2 == 0)
//		{
//			System.out.println(num+" is not a prime number");
//		}
//		else
//		{
//			System.out.println(num+" is a prime number");
//		}
		
		
		
		
		
		

	}

}
