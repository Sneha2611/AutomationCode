package Collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> empid = new TreeMap<Integer, String>();
		empid.put(105, "Tom");
		empid.put(101, "Sam");
		empid.put(109, "John");
		empid.put(102, "Lisa");
		empid.put(100, "Sara");
		
		System.out.println(empid);
		
		empid.forEach((k,v) -> System.out.println(k+" "+v));
		
		
		System.out.println(empid.lastKey());
		System.out.println(empid.firstKey());
		
		
		Set<Integer> keylessthan150=empid.headMap(105).keySet();
		System.out.println(keylessthan150);
		
		
		Set<Integer> keysgreaterthanequal150 = empid.tailMap(105).keySet();
		System.out.println(keysgreaterthanequal150);
		
		
		TreeMap<String, Integer> empname = new TreeMap<String, Integer>();
		empname.put("Google", 100000);
		empname.put("Xoriant", 5000);
		empname.put("Apple", 10000);
		empname.put("Facebook", 5500);
		empname.put("Dell", 8900);
		empname.put("Microsoft", 6000);
		empname.put("Google", 1000);
		
		System.out.println(empname);
		
		empname.forEach((k,v) -> System.out.println(k+" "+v));
		
		TreeMap<Integer, String> empid1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		empid1.put(105, "Tom");
		empid1.put(101, "Sam");
		empid1.put(109, "John");
		empid1.put(102, "Lisa");
		empid1.put(100, "Sara");
		
		System.out.println(empid1);
	}

}
