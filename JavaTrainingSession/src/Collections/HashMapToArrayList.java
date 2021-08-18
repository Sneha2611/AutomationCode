package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> compsize = new HashMap<String, Integer>();
		compsize.put("Google", 10000);
		compsize.put("Facebook", 5000);
		compsize.put("Apple", 20000);
		compsize.put("Dell", 15000);
		
		Iterator itr= compsize.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry pairs=(Map.Entry)itr.next();
			
			System.out.println(pairs);
		}
		
		System.out.println("--------------------------------------------------------");
		
		//lambda function
		compsize.forEach((k,v) -> System.out.println("key "+k+" value "+v));
		
		System.out.println("**************************************************************");
		
		//convert hashmap keys into arraylist
		
		ArrayList<String> arr1 = new ArrayList<String>(compsize.keySet());
		
		System.out.println(arr1);
		System.out.println("------------------------------------------------------------");
		for(String s : arr1)
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		
		//converting hashmap values into arraylist
		ArrayList<Integer> arr2 = new ArrayList<Integer>(compsize.values());
		
		System.out.println(arr2);
		System.out.println("------------------------------------------------------------");
		for(Integer i : arr2)
		{
			System.out.println(i);
		}
		
		

	}

}
