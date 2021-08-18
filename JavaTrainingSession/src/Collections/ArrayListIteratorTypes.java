package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteratorTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> movies = new ArrayList<String>();
		
		movies.add("Joker");
		movies.add("Inception");
		movies.add("Interstellar");
		movies.add("Conjuring");
		movies.add("James Bond");
		
		System.out.println(movies);
		System.out.println();
		//1.Using for loop with order/index
		
		System.out.println("1. printing using for loop with order/index");
		for(int i =0 ; i<movies.size();i++)
		{
			System.out.println(movies.get(i));
		}
		
		System.out.println("-----------------------------------------");
		System.out.println();
		
		System.out.println("2. Using java 8 with for each loop and lambda expression");
		
		movies.forEach(films ->
		{
			System.out.println(films);
		});
		
		System.out.println("---------------------------------------------");
		System.out.println();
		
		System.out.println("3. Using iterator");
		
		Iterator<String> itr = movies.iterator();
		while(itr.hasNext()) {
			String i = itr.next();
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("4. Using iterator and java 8 foreachremaining() method");
		
		itr = movies.iterator();
		itr.forEachRemaining(films ->
		{
			System.out.println(films);
		});
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
		System.out.println("5. Using for each loop");
		
		for(String shows :movies)
		{
			System.out.println(shows);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
		System.out.println("6.Using listiterator to traverse in both the directions");
		//use hasnext for ascending order
		ListIterator<String> moviesListIterator = movies.listIterator(movies.size());
		while(moviesListIterator.hasPrevious()) {
			String film = moviesListIterator.previous();
			System.out.println(film);
		}
		
	}

}
