package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		String s1 = "Hello";
		String s2 ="World";
		
		System.out.println(a+b);
		System.out.println(s1+s2);
		
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
		
		System.out.println(a+s1+b+s2);
		System.out.println();
		
		System.out.println(s1+s2+(a+b));
		System.out.println((s1+a)+(s2+b));

	}

}
