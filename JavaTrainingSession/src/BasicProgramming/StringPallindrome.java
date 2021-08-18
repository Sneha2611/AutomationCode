package BasicProgramming;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String org_str = str;
		
		String rev = "";
		
		int len = str.length();
		
		
		for(int i=len-1; i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		if(org_str.equalsIgnoreCase(rev))
		{
			System.out.println(org_str+" is a pallindrome");
		}
		else
		{
			System.out.println(org_str+" is a not pallindrome");
		}
		
		
		

	}

}
