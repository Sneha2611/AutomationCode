package BasicProgramming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words[] = {"Java","Python","C","Java","html","C"};
		
		
		System.out.println("------------Bruteforce------------------------");
		
		for(int i=0 ; i<words.length ; i++)
		{
			for(int j=i+1 ; j<words.length ; j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[i]);
				}
			}
		}
		
		
		System.out.println("-----------------Hashset------------------------------");
		
		
		Set<String> wordset = new HashSet<String>();
		for(String e : words)
		{
			if(wordset.add(e)== false)
			{
				System.out.println(e);
			}
		}
		
		
		
		
		
		
	}

}
