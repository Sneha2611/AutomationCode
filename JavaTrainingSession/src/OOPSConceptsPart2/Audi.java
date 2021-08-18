package OOPSConceptsPart2;

public class Audi extends Car {

	//When same method is present in both parent and child class with same name and same no. of arguments 
			//it is called method overriding
	public void start()	//overriden method
	{
		System.out.println("AUDI ---- start");
	}
	
	public void theftSafety()
	{
		System.out.println("AUDI ---- theftsafety");
	}
}
