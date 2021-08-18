package OOPSConceptsPart2;

public class HDFCBank implements USBank,LondonBank {

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hdfc --- credit");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hdfc ---- debit");
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("hdfc --- transfermoney");
	}

	public void educationLoan() {
		System.out.println("hdfc --- eduloan");
	}
	
	public void carLoan() {
		System.out.println("hdfc ---- carloan");
	}

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		System.out.println("hdfc ---- mutualfund");
	}
	
}
