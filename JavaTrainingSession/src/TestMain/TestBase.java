package TestMain;

public class TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method -1");
		
		TestBase t = new TestBase();
		t.main(10);
		t.main("sneha");
		t.main(30, 20);
	}
	
	public static void main(int x) {
		// TODO Auto-generated method stub
		System.out.println("main method -2");
	}
	
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("main method -3");
	}
	

	
	public static void main(int x,int y) {
		// TODO Auto-generated method stub
		System.out.println("main method -4");
	}
	
}
