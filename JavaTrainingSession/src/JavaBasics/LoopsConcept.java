package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		//disadvantage if while loop--- if increment/decrement is not given it leads to infinite loop
		int i=0;		//initialization
		while(i<=10)	//condition
		{
			System.out.println(i);
			i++;		//increment/decrement
		}

		System.out.println("***************************************************");
		
		//for loop
		for(int j = 10;j>=-10;j--)
		{
			System.out.println(j);
		}
		
		
	}

}
