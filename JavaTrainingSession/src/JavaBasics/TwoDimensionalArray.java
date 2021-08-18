package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[][]=new String[4][3];
		
		s[0][0] = "a1";
		s[0][1] = "a2";
		s[0][2] = "a3";
		
		s[1][0] = "b1";
		s[1][1] = "b2";
		s[1][2] = "b3";
		
		s[2][0] = "c1";
		s[2][1] = "c2";
		s[2][2] = "c3";
		
		s[3][0] = "d1";
		s[3][1] = "d2";
		s[3][2] = "d3";
		
		
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		
		
		System.out.println(s[3][1]);
		
		
		for(int rows=0;rows<s.length;rows++)	//no of rows
		{
			
			for(int cols=0;cols<s[0].length;cols++)
			{
				System.out.print(s[rows][cols]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
