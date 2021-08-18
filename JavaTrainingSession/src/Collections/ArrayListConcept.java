package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(10);
		ar.add("Sneha");
		ar.add('a');
		ar.add(15.7);
		
		System.out.println(ar.size());
		
		ar.add(20);
		ar.add("John");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(5));
		
		System.out.println(ar.contains(90));
		
		for(int i =0;i<ar.size();i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(20);
		//ar1.add("eded");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("nil");
		//ar2.add(90);
		
		
	}

}
