package AbstractionConcept;

public abstract class Bank {
	
	//partial abstraction
	//can contain abstract as well as non abstract methods
	//hiding implementation logic is called abstraction
	
	public abstract void loan();	//abstract method - no method body
	
	
	public void credit()
	{
		System.out.println("Bank-------credit");
	}
	
	public void debit()
	{
		System.out.println("Bank--------debit");
	}
	

	
}
