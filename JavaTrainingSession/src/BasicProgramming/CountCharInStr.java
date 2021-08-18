package BasicProgramming;

public class CountCharInStr {

	
	//CharArray - for loops
	
	public static void charCount(String str, char val)
	{
		int count = 0;
		for(char ch : str.toCharArray())
		{
			if(ch == val)
				count++;
		}
		System.out.println(val+" : "+count);
	}
	

	//str.len -- charAt(i)
	
	public static void charAtcount(String str, char val)
{
	int count = 0;
	for(int i = 0;i<str.length();i++)
	{
		if(str.charAt(i)==val)
			count++;
	}
		
	System.out.println(val+" : "+count);	
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is Sneha Acharya";
		charCount(str, 'n');
		
		charAtcount(str, 'a');
		
		
	}
	
	
	
	

}
