package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Hash map is a class that implements map interface
		//extends AbstractMap
		//it contains only unique elements
		//stores as key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hash map is non synchronized - not thread safe
		//concurrent modification exception - fail fast condition
		
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(1, "Sneha");
	hm.put(2, "John");
	hm.put(3, "Mike");
	hm.put(4, "Sara");
	//hm.put(null, "tim");
	System.out.println(hm);
	//System.out.println(hm.get(null));
	
	
	HashMap<String,Integer> hash = new HashMap<String,Integer>();
	hash.put("Sneha" , 200);
	hash.put("John", 300);
	hash.put("Mike", 700);
	hash.put("Sara", 400);
	hash.put(null, 900);
	
	
	
	
	
	System.out.println(hm.get(3));
	System.out.println(hm);
	
	for(Entry e : hm.entrySet())
	{
		System.out.println("Student "+e.getKey());
		System.out.println(e.getKey()+ " "+e.getValue());
		
	}
		
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("John" , 20 , "QA");
		Employee e2 = new Employee("Sara" , 30 , "SDET");
		Employee e3 = new Employee("Sam" , 25 , "Data scientist");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		System.out.println(hm1);
		
		for(Entry<Integer,Employee> t : hm1.entrySet())
		{
			int key = t.getKey();
			Employee emp = t.getValue();
			System.out.println("Employee "+key);
			System.out.println(emp.name+" "+emp.age+" "+emp.job);
		}
		

	}

}
