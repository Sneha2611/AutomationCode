package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		
		h.put(1, "sneha");
		h.put(2, "Swati");
		h.put(3, "John");
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		
		System.out.println(h);
		
		Hashtable<String, String> h1 = new Hashtable<String, String>();
		
		h1.put("a", "sneha");
		//h1.put(1, "ghfh");
		
	}

}
