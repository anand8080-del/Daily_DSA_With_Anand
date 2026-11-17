package practice.dsa.arrays01_linearsearch;

public class LinearSearch03_FindFirstOccurance {
	
	public static void main(String[] args) {
		
		//find the first Occurance of the target element in the array   
		
	int arr[] = {12,2,22,2,22,2,2,2,2,2,2,2,};
	
	boolean verifiedNum[] = new boolean[arr.length];
	
	int target =2;
	
	findFirstOccurance(arr, target, verifiedNum);
		
	}

	public static void findFirstOccurance(int arr[], int target, boolean verifiedNum[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
		       verifiedNum[i]=true;
		       System.out.println("the First Occurance of the target element "+target+" is found at index "+i);
			    break;	  	
			}
		}
		
		
	}
	
}
