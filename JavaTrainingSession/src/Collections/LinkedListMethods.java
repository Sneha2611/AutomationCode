package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//LL is a default class in java
		//it can be used as List,stack,queue
		//it allows null entry
		//dynamic collection
		//hence insertion and deletion can be easily implemented
		//it can contain duplicate elements
		//it is not synchronized(not thread safe)
		//manipulation is fast because we don't need any shifting
		
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll.size());
		
		ll.add("Sneha");
		ll.add("Sam");
		
		System.out.println(ll.size());
		
		System.out.println(ll);
		System.out.println(ll.get(0));
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		
		ll.add("Tom");
		ll.add("John");
		System.out.println(ll);
		
		ll.add(1, "Sara");
		System.out.println(ll);
		
		ll.addFirst("Ken");
		System.out.println(ll);
		
		ll.addLast("Jen");
		System.out.println(ll);
		
		//ll.clear();   	//list becomes empty
		//ll.remove() or ll.removeA();  a particular element or collection is removed
		
		LinkedList<String> lang = new LinkedList<String>();
		
		lang.add("Java");
		
		lang.add("Python");
		lang.add("SQL");
		lang.add("HTML");
		System.out.println(lang);
		System.out.println("1111111111111111111111111111111111111111111111111");
		
		Iterator<String> itr1 = lang.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("222222222222222222222222222222222222222222222");
		for(String s1 : lang)
		{
			System.out.println(s1);
		}
		System.out.println("33333333333333333333333333333333333333333333333333333");
		//sort
		Collections.sort(lang);
		System.out.println(lang);
	}

}
