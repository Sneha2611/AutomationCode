package BasicProgramming;

public class ReverseNoUsingRecursion {
	
	
	//reverse a number using recursion
	public static void reverse(int num)
	{
		if(num<10)
		{
			System.out.println(num);
		}
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 3416;
//		
//		while(num>0)
//		{
//		int rev = num%10;
//		System.out.print(rev);
//		num = num/10;
//		
		reverse(6754);
		
//		}

	}

}
