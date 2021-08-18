package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new java.util.Vector<Integer>();
		v1.add(20);
		v1.add(10);
		v1.add(45);
		v1.add(80);
		v1.add(35);
		v1.add(1);
		v1.add(55);
		v1.add(25);
		v1.add(5);
		v1.add(7);
		
		System.out.println(v1);
		
		System.out.println(v1.get(1));
		
		System.out.println(v1.remove(2));
		System.out.println(v1);
		
		
		Vector<Integer> v2 = new java.util.Vector<Integer>();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		
		v1.addAll(v2);
		System.out.println(v1);
		
		for(Integer i : v1)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************************************************");
		
		
		for(int x =0 ; x<v1.size(); x++)
		{
			System.out.println(v1.get(x));
		}
		
		System.out.println("**********************************************************");
		Iterator<Integer> itr= v1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		Collections.sort(v1);
		System.out.println(v1);
	}

}
