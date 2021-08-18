package BasicProgramming;

import java.util.HashMap;
import java.util.Set;

public class NoOfDuplicateWords {

	
	public static void findDuplicteWords(String inputString)
	{
		
		//split
		String words[] = inputString.split(" ");
		
		//create hashmap
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//to check each word in given array
		for(String word : words)
		{
			if(wordCount.containsKey(word))
			{
				wordCount.put(word, wordCount.get(word)+1);
			}
			else
			{
				wordCount.put(word, 1);
			}
		}
		
		//extracting all the keys of map wordcount
		Set<String> wordsInString = wordCount.keySet();
		
		//loop through all the words in wordcount
		for(String word : wordsInString)
		{
			if(wordCount.get(word)>=1)
			{
				System.out.println(word+ " : "+wordCount.get(word));
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
findDuplicteWords("java Java python html css html C ");
		
		

	}

}
