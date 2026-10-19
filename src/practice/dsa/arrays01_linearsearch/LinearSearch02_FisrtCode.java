package practice.dsa.arrays01_linearsearch;

public class LinearSearch02_FisrtCode {
	
	public static void main(String[] args) {
		
	   int[] arr = {10,20,30,8732164,382,2197,2187,21,8,387,982};
	   
	 int result =  search(arr, 42781);
	 
	 System.out.println(result);
	   
	  
	   
	}
	
	// this is the worst case if input growing then time also increases
	
	public static int search(int[] arr, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int index=0;index<arr.length;index++)
		{
			int element = arr[index];
			
			if(element==target)
			{
				System.out.println("the target element is: "+ arr[index]+ "            present at index: "+index);
			}
		}
		
		//return Integer.MAX_VALUE;   if you want  return this also 
		// return false;              if you want return this also
		return -1;
		
	}

}
