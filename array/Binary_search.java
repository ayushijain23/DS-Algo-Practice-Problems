package array;


/*
 * search a no x in an Array without finding out the length of array.
 * 
 * Soltion - we will start from 0th index, and increase in twice the previous step
 *          so steps would be - 0,1,2,4,8,16, 32....
 */
public class Binary_search {

	private static int  search(int low,int high,int x, int arr[])
	{		low--;
	       high--;
		try {		
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if( arr[mid] == x)
			{
				return mid;
			}
			
			if( arr[mid] < x)
			{
				low = mid+1;
			}
			
			else
				high = mid-1;
			
		}
		
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
		   high--;
		}
		return -1;
	}
	public static void main(String[] args) throws RuntimeException {
		int arr[] = {1,3,6,7,8,9,10};
		
		int x = 10;
		int i = 1;
		
		try {
		while(true)
		{
			
			if( arr[i-1] == x)
			{
				System.out.println("Found at Index "+ (i-1));
				return ;
			}
			
			if( arr[i-1] < x)
			{
				i = i*2;
				System.out.println(i);
			}
			
			else if( arr[i-1] > x)
			{
				int j = search(i/2,i,x,arr);
				System.out.println("Found at Index "+ j);
				return ;
			}
			
		}

	  } catch(ArrayIndexOutOfBoundsException e)
		{
		    
		    int j = search(i/2,i,x,arr);
			System.out.println("Found at Index "+ j);
			return ;
		}

}
}
