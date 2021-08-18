package AbstractionConcept;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICIBank i =new ICICIBank();
		i.credit();
		i.debit();
		i.loan();
		
		
		Bank b = new ICICIBank();	
		b.credit();
		b.debit();
		b.loan();
		
		
		//Bank b1 =new Bank(); object cannot be created for abstract class
		
		
	}

}
