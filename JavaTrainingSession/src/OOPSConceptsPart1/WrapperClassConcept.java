package OOPSConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "100";
		System.out.println(s+100);
		
		//string to int
		int x=Integer.parseInt(s);
		System.out.println(x+100);
		
		//string to double
		double d =Double.parseDouble(s);
		System.out.println(d+2.5);
		
		//string to boolean
		String k="false";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string
		int y = 30;
		System.out.println(y+20);
		String g = String.valueOf(y);
		System.out.println(g+20);
		
		String m= "200Q";
		//int p = Integer.parseInt(m);
		//System.out.println(p);//Number format exception
		
	}

}
