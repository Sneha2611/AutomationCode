package StarPattern;

public class Alphabetpattern1 {

	
//	A 
//	B B 
//	C C C 
//	D D D D 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alphabet = 65;
		
		for(int i =1; i<=4 ; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print((char)alphabet+" ");
			}
			System.out.println();
			alphabet++;
		}
		
		

	}

}
