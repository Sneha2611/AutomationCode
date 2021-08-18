package OOPSConceptsPart1;

public class StaticandNonstaticconcepts {
	
	String s = "Tim";		//non static global variable
	static int a = 30;		//static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticandNonstaticconcepts sn=new StaticandNonstaticconcepts();		
		//how to call static methods and vars
		//1.Direct calling
		sum();
		//2.Call by classname
		StaticandNonstaticconcepts.sum(); 
		System.out.println(a);
		
		sn.sum();		//static methods can be accessed using object ref
		
		System.out.println(sn.s);

	}
	
	public void sendMail()		//non static method
	{
		System.out.println("sendMail method");
	}

	
	public static void sum()	//static method
	{
		System.out.println("Sum method");
	}
	
	
}
