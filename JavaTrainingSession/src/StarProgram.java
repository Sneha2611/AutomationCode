
public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4;
		int cols = 4;
		for(int i=0; i<rows ; i++)
		{
			for (int j=cols-1 ; j>i; j--)
			{
				System.out.print(" ");
				
			}
			
			for(int j=0; j<=i ;j++ )
			{
				System.out.println("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
