package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedandConcurrentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Java");
		m1.put(2, "Selenium");
		m1.put(3, "C++");
		
		//create synchronized hashmap
		Map<Integer, String> syncmap=Collections.synchronizedMap(m1);
		System.out.println(syncmap);
		syncmap.put(7, "HTML");
		System.out.println(syncmap);
		
		//ConcurenyHashmap
		
		ConcurrentHashMap<Integer, String> conmap = new ConcurrentHashMap<Integer, String>();
		
		conmap.put(10, "ghscfhj");
		conmap.put(20, "fvsv");
		
		System.out.println(conmap.get(20));

	}

}
