package MethodHiding;

public class Car {
	
	//method hiding
	public static void start()
	{
		System.out.println("CAR ----- start");
	}
	
	public void stop()
	{
		System.out.println("CAR ------- stop");
	}

	public void refeul()
	{
		System.out.println("CAR -------refeul");
	}
}

//static method cannot be overriden 
//overriding is possible
//same static method present in child as well as parent class but parent class static method can never be called---method hiding