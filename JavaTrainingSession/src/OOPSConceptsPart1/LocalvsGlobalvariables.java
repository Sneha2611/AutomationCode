package OOPSConceptsPart1;

public class LocalvsGlobalvariables {
	
	String s = "Jen";		//global variable - class variable
	int a = 20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;;		//local variable for main method
		
		LocalvsGlobalvariables l=new LocalvsGlobalvariables();
		
		System.out.println(a);
		System.out.println(l.s);
		System.out.println(l.a);
	l.sum();
		
	}
	
	public void sum() {
		
		int a = 30;		//local variable for sum method
		int b = 50;
		System.out.println(a);
	}

}
