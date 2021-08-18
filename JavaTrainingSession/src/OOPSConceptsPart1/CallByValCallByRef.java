package OOPSConceptsPart1;

public class CallByValCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValCallByRef c=new CallByValCallByRef();
		
		int a=10;
		int b=20;
		c.sum(a, b);	//call by value or pass by value
		
		c.p=30;
		c.q=40;
		c.swap(c);
		//after swap
		System.out.println(c.p);
		System.out.println(c.q);
		

	}
	
	public void sum(int x,int y)
	{
		x=40;
		y=30;
		int z = x+y;
		System.out.println(z);
	}
	
	//call by ref - passing the value with object reference
	
	public void swap(CallByValCallByRef t)
	{
		int temp;
		temp = t.p;		//temp=50
		t.p = t.q;		//t.p=30
		t.q = temp;		//t.q=50
		
	}

}
