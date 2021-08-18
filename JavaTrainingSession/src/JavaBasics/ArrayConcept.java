package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dis-adv of array
		//1.size is fixed - static array - to overcome this we use collection
		//2.stores only similar datatype - to overcome this we use Object array
		
		int a[]=new int[4];
		a[0]=6;
		a[1]=10;
		a[2]=15;
		a[3]= 2;
		
		System.out.println(a[2]);
		System.out.println(a.length);
		//System.out.println(a[5]);   -------- Array index out of bound exception
		
		System.out.println("-----------------------------------------------------------------------");
		
		for(int j=0; j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		
		
		double d[]= new double[3];
		d[0]=7.8;
		d[1]=56.9;
		
		System.out.println(d[1]);
		
		System.out.println("--------------------------------------------------------------------------");
		
		//Object array - Object is a class - used to store values with different datatypes
		
		Object obj[] = new Object[3];
		
		obj[0]="Sneha";
		obj[1]=20;
		obj[2]=56.99;
		
		System.out.println(obj[0]);
		
		for(int o=0; o<obj.length ; o++)
		{
			System.out.println(obj[o]);
		}
		
		
		

	}

}
