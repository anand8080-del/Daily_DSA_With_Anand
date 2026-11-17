package practice.dsa.arrays;

import java.util.Arrays;

public class Array19_CalculateFrequency {
	
	public static void main(String[] args) {
		
		//find the Frequency Of Each Element In Array
		
		int arr[] = {10,20,10,20,30,30,30,49,47,48,478,8};
		
		
		boolean visitedNum[] = new boolean[arr.length];
		System.out.println(Arrays.toString(visitedNum));  //By Default this array all elements are false
		
		
		findFrequency(arr, visitedNum);
		
	}
	
	public static void findFrequency(int arr[], boolean VisitedNum[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int counter = 1;
			
		    if(VisitedNum[i]==true)
		    {
		    	continue;
		    }
		  
		    
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					counter++;
					VisitedNum[j] = true;
					
				}
			}
			
			System.out.println("Element is: "+arr[i] + " Frequency is: "+counter);
		}
	}

}
