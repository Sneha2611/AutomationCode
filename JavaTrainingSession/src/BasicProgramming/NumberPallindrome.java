package BasicProgramming;

public class NumberPallindrome {
	
	public static void isPallindrome(int num)
	{
	
	int remainder = 0;
	int sum=0;
	int t;
	
	t=num;
	
	while(num>0)
	{
		remainder = num%10;
		sum = (sum*10) + remainder;
		num = num/10;
	}
	
	
	if(t==sum)
	{
		System.out.println(t+" : Number is pallindrome");
	}
	else
	{
		System.out.println(t+" : Number is not pallindrome");
	}

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPallindrome(23);
	}

}
