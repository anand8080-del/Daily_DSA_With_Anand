package practice.dsa.arrays;

import java.util.Arrays;

public class Array18_SwappingNumbersUsingIndicess {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,39,37,87,78,28,28,28};
		
		swampNumbers(arr, 0, 5);
		
	}
	
	public static void swampNumbers(int arr[],int i,int j)
	{
	    
		int temp = arr[i];
		
		arr[i]=arr[j];
		
		arr[j]=temp;
		
		
		System.out.println(Arrays.toString(arr));
	}

}
