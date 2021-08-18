package BasicProgramming;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Goo d    Morn       ing    ";
		
		
		
		  String new_str[] = str.split(" ");
		  
		  for(int i=0;i<new_str.length;i++)  
		  { 
			  System.out.print(new_str[i]); 
		}
		 
		
		
		
	}

}
