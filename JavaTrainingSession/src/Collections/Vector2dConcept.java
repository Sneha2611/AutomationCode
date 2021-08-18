package Collections;

import java.util.Vector;

public class Vector2dConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> langvector = new Vector<String>();
		
		langvector.add("Java");
		langvector.add("Python");
		langvector.add("Javascript");
		langvector.add("SQL");
		
		
		Vector<String> osvector = new Vector<String>();
		osvector.addAll(langvector); //0
		
		System.out.println(osvector);
		System.out.println(langvector);
		
		System.out.println(osvector.get(0));
		
		/*
		 * for(int i=0 ; i<osvector.size(); i++) { System.out.println(osvector.get(i));
		 * }
		 */
		
		/*
		 * for(int i=0 ; i<langvector.size(); i++) { String str =
		 * (String)((Vector)osvector.get(0)).get(i); }
		 */
	}

}
