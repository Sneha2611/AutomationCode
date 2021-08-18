package Collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMatCreatingWays {
	
	
	  public static Map<Integer, String> marksmap;
	  
	  static{ marksmap = new HashMap<Integer, String>(); marksmap.put(1,"sneha");
	  marksmap.put(2, "John"); }
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Using HashMap class
		HashMap<Integer, String> h1 = new HashMap<>();
		Map<Integer, String> m1 = new HashMap<>();
		
		//2. static way --- static hashmap
		System.out.println(HashMatCreatingWays.marksmap.get(2));
		
		//3. immutablemap with only one single entry
		
		Map<Integer, String> m2 =Collections.singletonMap(4, "tom");
		System.out.println(m2.get(4));
		//m2.put(5, "sam");		UnsupportedOperationException
		
		
		//4. JDK 8
		//creating one 2D array pf string using Stream and collecting in the form map
		
		Map<String,String> m3=Stream.of(new String[][]
		{
			{"sads" , "dsvs"},
			{"fgvdf" , "sdfsfs"}
			
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(m3.get("sads"));
		m3.put("don", "234");
		System.out.println(m3.get("don"));
		
		//5. using simple entry - mutable..........
		
		Map<String, String> m5=Stream.of(
				new AbstractMap.SimpleEntry<>("1","abc"),	//use SimpleImmutableEntry<> for immutable
				
				new AbstractMap.SimpleEntry<>("2","xyz")
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(m5.get("2"));
		
		
		//JDK 1.8
		//JDK 1.p Map.of
		//empty map
		Map<String, String> m7 = Collections.emptyMap();
		System.out.println(m7);
		//m7.put("123", "uih");
		
		
	}

}
