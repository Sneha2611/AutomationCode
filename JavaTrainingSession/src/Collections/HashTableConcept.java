package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//similar to hasmap, but synchronized
		//stores tha vlaue on the basis of key value
		//key --->object - Hashcode ---> value
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "sneha");
		h1.put(2, "Swati");
		h1.put(3, "John");
		
		System.out.println(h1.size());
		
		System.out.println(h1.get(1));
		
		System.out.println(h1);
		
		//Hashtable h1 = new Hashtable();
		
		h1.put(1, "sneha");
		//h1.put(null, "ghfh");     nullpointer exception
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
		if(h1.containsValue("sneha"))
		{
			System.out.println("successss");
		}
		
		//print all the values from hashtable using enumerator
		
		Enumeration e=h1.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//print all the values from hashtable using entryset
		
		
		Set s =h1.entrySet();
		System.out.println(s);
		
		
		
		if(h1.equals(h2))
		{
			System.out.println("success");
		}
		
		//print value from a key
		
		System.out.println(h1.get(1));
		
		//get the hashcode of hashable object
		
		//incase of cloning both the objects will have the same hashcode
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
	}

}
