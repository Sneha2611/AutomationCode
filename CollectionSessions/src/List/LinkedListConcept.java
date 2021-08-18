package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Java");
		ll.add("Python");
		ll.add("SQL");
		ll.add("HTML");
		ll.add("C++");
		
		System.out.println(ll);
		System.out.println(ll.get(2));
		
		ll.set(2, "C");
		System.out.println(ll);
		
		ll.addFirst("Mongodb");
		ll.addLast("XML");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println("---------------------------------------------------------------------");
		
		//how to print all the values of linkedlist
		
		//for loop
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("---------------------------------------------------------------------");
		
		//advanced for loop
		
		for(String s : ll)
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------------------------------------");
		
		//Iterator
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		//while loop
		
		int j=0;
		while(j<ll.size()) {
			
			System.out.println(ll.get(j));
			j++;
			
		}
		
		
		
	}

}
