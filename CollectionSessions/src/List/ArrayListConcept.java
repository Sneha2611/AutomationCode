package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = new int[6];	//static array - size is fixed
		
		
		//1.Dynamic array - arraylist
		//2.Can contain duplicate values/elements
		//3.maintains insertion order
		//4.Synchronized
		//5.allows random access to fetch the elements because it stores the values on the basis of indexes
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
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(20);
		//ar1.add("eded");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("nil");
		//ar2.add(90);
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		ArrayList<Student> ar4 = new ArrayList<Student>();
		
		Student s1 = new Student("Sneha", 1, "English");
		Student s2 = new Student("Sam", 45, "Science");
		Student s3 = new Student("Jen", 20, "Maths");
		Student s4 = new Student("John", 2, "evs");
		
		ar4.add(s1);
		ar4.add(s2);
		ar4.add(s3);
		
		System.out.println(ar4.size());
		ar4.add(s4);
		
		System.out.println(ar4.size());
		
		System.out.println(ar4.get(1).name);
		System.out.println(ar4.get(2).roll_no);
		System.out.println(ar4);
		System.out.println("-------------------------------------------------------------------------------------------------");
		Iterator<Student> itr = ar4.iterator();
		
		while(itr.hasNext())
		{
			Student st = itr.next();
			System.out.print(st.name+" "+st.roll_no+" "+st.subject);
			System.out.println();
		}
		
		//addall
		
		ArrayList ar5 = new ArrayList();
		ar5.add(20);
		ar5.add(10);
		
		ArrayList ar6 = new ArrayList();
		ar6.add("Sneha");
		ar6.add("John");
		ar6.add(20);
		
		System.out.println("--------------------------------------------------------------------------------");
		ar5.addAll(ar6);
	
		System.out.println(ar5);
		for (int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		
		/*ar5.removeAll(ar6);
		System.out.println(ar5);
		System.out.println("-------------------------------------------");*/
		
		ar5.containsAll(ar6);
		System.out.println(ar5);
		for (int j=0;j<ar5.size();j++)
		{
			System.out.println(ar5.get(j));
		}
		System.out.println("----------------------------------------------");
		
		ArrayList ar7 = new ArrayList();
		ar7.add(20);
		ar7.add(10);
		
		ArrayList ar8 = new ArrayList();
		ar8.add("Sneha");
		ar8.add("John");
		ar8.add(20);
		
		ar7.retainAll(ar8);
		for (int j=0;j<ar7.size();j++)
		{
			System.out.println(ar7.get(j));
		}
		
		
	}

}
