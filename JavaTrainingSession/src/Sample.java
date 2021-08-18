
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//0 1 1 2 3 5 8 13 21 33....
		
		
		
		int n1 = 0,n2 = 1,sum,count=10;
		
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<count;i++)
		{
			sum = n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
			
		}
		
	}

}
