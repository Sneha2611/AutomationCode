package Collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	//not synchronized
	//high performance java collection member
	//faster than hashset
	//all the methods are implemented using bitwise arithmetic operations
	
	enum Country
	{
		India,
		Australia,
		China,
		Sri_Lanka,
		France
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//created a new enumset using enum
		EnumSet<Country> c = EnumSet.allOf(Country.class);
		System.out.println(c);
		
		//empty enumset
		EnumSet<Country> c1 = EnumSet.noneOf(Country.class);
		System.out.println(c1);
		
		//range
		EnumSet<Country> c2 = EnumSet.range(Country.Australia,Country.Sri_Lanka);
		System.out.println(c2);
		
		//of
		EnumSet<Country> c3 = EnumSet.of(Country.China);
		System.out.println(c3);
		
		//of - multiple elemnts
		EnumSet<Country> c4 = EnumSet.of(Country.France, Country.Australia);
		System.out.println(c4);
		
		//add and addall
		
		c1.add(Country.Australia);
		System.out.println(c1);
		
		c1.addAll(c);
		System.out.println(c1);
		
		//how to iterate Enumset
		
		Iterator<Country> itr = c.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//remove and removeall
		
		c.remove(Country.China);
		System.out.println(c);
		
		c.removeAll(c);
		System.out.println(c);
		
	}

}
