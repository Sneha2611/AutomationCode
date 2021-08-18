package SearchingAndSorting;

import java.util.Arrays;

public class BinarySearch {

	
	public static void binsearch(int arr[],int key, int low,int high)
	{
		
		int mid;
		
		mid = (high - low) / 2;
		System.out.println(mid);
		System.out.println(arr[mid]);
		
		
		
		while(low<=high)
		{
			if(arr[mid]==key)
			{
				System.out.println(key+" is fount at "+mid+" position");
				break;
			}
			
			else if(arr[mid]>key)
			{
				high = mid-1;
				mid = (high + low) /2;
				
			}
			
			else
			{
				low = mid+1;
				mid = (high + low) /2;
			}
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {4,10,1,67,45,3,6,30,24};
		int key = 3;
		 Arrays.sort(arr);
		 for(int i =0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
		 System.out.println();
		 binsearch(arr, key,0, arr.length-1);
		 
		 
	}

}
