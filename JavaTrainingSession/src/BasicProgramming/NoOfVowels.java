package BasicProgramming;

import java.util.Scanner;

public class NoOfVowels {
	
	
	public static boolean isVowel(char c)
	{
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				count++;
			}
		}
         
		System.out.println(count);
	}

}
