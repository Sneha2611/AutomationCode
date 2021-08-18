package AbstractionConcept;

public class ICICIBank extends Bank {
	
	
	public void credit()
	{
		
		System.out.println("ICICI-------credit");
	}
	
	public void debit()
	{
		System.out.println("ICICI--------debit");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
		System.out.println("ICICI------loan");
		
	}

}
