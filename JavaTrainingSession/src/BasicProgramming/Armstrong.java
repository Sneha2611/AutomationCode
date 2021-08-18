package BasicProgramming;

public class Armstrong {
	
	
	public void isArmstring(int num)
	{
		
		int cube = 0;
		int r;
		int t;
		t=num;
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			cube = cube + (r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println(t+" : Number is armstrong");
		}
		else
		{
			System.out.println(t+" : Number is not armstrong");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armstrong a = new Armstrong();
		a.isArmstring(151);

	}

}
