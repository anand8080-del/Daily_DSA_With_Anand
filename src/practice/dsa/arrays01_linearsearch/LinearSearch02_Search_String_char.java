package practice.dsa.arrays01_linearsearch;

import java.util.Arrays;

public class LinearSearch02_Search_String_char {
	
	public static void main(String[] args) {
		
		
		// Searching the Element in the String Using a Linear Search Algorithm
		
		String name = "mangesh";
		
		char arr[] = name.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		char target='s';
		
		searchString(name, target, arr);
		
	}
	
	public static void searchString(String name, char target,char arr[])
	{
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==target)
	    	{
	    		System.out.println("Target Element is "+arr[i]+" found at index "+i);
	    	}
	    }
	}

}
