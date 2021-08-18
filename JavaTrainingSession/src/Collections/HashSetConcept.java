package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> langset = new HashSet<String>();
		langset.add("Java");
		langset.add("SQL");
		langset.add("Python");
		langset.add(null);
		
		System.out.println(langset);
		
		System.out.println(langset.contains("SQL"));

		for(String s : langset)
		{
			System.out.println(s);
		}
		langset.remove(null);
		
		System.out.println(langset);
		
		
		HashSet<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,6,7,9,10}));
		
		HashSet<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11}));
		
		
		
		HashSet<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		first.retainAll(second);
		System.out.println(first);
		
		second.removeAll(first);
		System.out.println(second);
		
	}

}
