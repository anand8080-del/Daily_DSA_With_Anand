package practice.dsa.arrays01_linearsearch;

public class LinearSearch04_FindLastOccurance {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,2};
		
		int target = 2;
		
		findLastOccurance(arr, target);
		
	}
	
	public static void findLastOccurance(int arr[],int target)
	{
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]==target)
			{
				int k =i;
				 System.out.println("Last Occurance of "+target+" is at index : "+k);
				 break;
			}
		}
		
		
	}

}
