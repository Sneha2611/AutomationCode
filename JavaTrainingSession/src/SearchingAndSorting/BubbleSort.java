package SearchingAndSorting;

public class BubbleSort {

	public static void bubblesort(int arr[])
	{
		int temp;
		int n= arr.length;
		for(int k=0; k<n;k++)
		{
			for(int j=1;j<n-k;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {50,3,90,10,4,1,9,20,40};
		System.out.println("Before sorting : ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		bubblesort(arr);
		System.out.println();
		System.out.println("After sorting : ");
		for(int j=0;j<arr.length;j++)
		{
		System.out.print(arr[j]+" ");

	}
	}
}
