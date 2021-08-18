package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearch {

	
	public static void linearSearch(int arr[],int key)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key+ " is present "+i+"th "+"index in the array");
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4, 12, 7, 40,22,10};
		
		int key = 10;
		 linearSearch(arr, key);
		
		
	}

}
