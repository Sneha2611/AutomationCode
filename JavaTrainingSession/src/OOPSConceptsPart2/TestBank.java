package OOPSConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(USBank.min_bal);
		//USBank.min_bal = 100;
		
		HDFCBank h = new HDFCBank();
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		h.mutualfund();
		
		System.out.println("-------------------------------------------------------");
		
		//dynamic polymorphism
		//child class object can be referred by parent interface refernce variable
		
		USBank u=new HDFCBank();
		
		u.credit();
		u.debit();
		u.transferMoney();
		
	}

}
