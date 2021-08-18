package OOPSConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//compile time polymorphism - static polymorphysm
		//At the time of compilation java will decide which method to call
		Audi a = new Audi();
		a.start();	
		a.stop();
		a.refuel();
		a.theftSafety();
		a.engine();
		
		System.out.println("************************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//parent class cannot access child class methods
		c.engine();
		
		System.out.println("***************************");
		
		//Top casting
		Car c1 = new Audi();	//child class object can be referred by parent class reference variable -- dynamic polymorphism/run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//theftsafety cannot be accessed as parent class reference is used, it can be accessed using static polymorphism
		
		//Down casting
		Audi a1 = (Audi)new Car();	//Classcast Exception
		//At compile time java will be confused,at run time it will give exception
		
		
	}

}
