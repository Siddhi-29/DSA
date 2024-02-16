package Day4;

public class Minmax
{
	static class Pair
	{
		int max;
		int min;
	}	
	static Pair getMinMax(int arr[], int n)
	{		
		Pair minmax = new  Pair();
		int i;
		if (n == 1)
		{
			minmax.max = arr[0];
			minmax.min = arr[0];			
			return minmax;
		}		
		if (arr[0] > arr[1])
		{
			minmax.max = arr[0];
			minmax.min = arr[1];
		}		
		else
		{
			minmax.min = arr[1];
			minmax.max = arr[0];
		}
		for (i = 2; i < n; i++)
		{
			if (arr[i] > minmax.max)
			{
				minmax.max = arr[i];
			} else if (arr[i] < minmax.min)
			{
				minmax.min = arr[i];
			}
		}
		return minmax;
	}	
	public static void main(String args[]) {
		int arr[] = {7, 11, 445, 10, 330, 3000};
		int arr_size = 6;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Min element "+ minmax.min);
		System.out.println("Max element "+minmax.max);
	}
}



 /* Nv's:
 * 
class GFG {
    
    static class Pair{
        int min , max;
        Pair(){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
    }
    
    
	public static void main (String[] args) {
	    int[] arr = { 5 , 2 , 1 , 10 , 3 };
	    Pair res = solve(arr);
	    System.out.println("Max : " + res.max + "\nMin : " + res.min);
	}
	
	public static Pair solve(int[] arr){
	    Pair curr = new Pair();
	    for(int ele : arr){
	        curr.min = Math.min(curr.min , ele);
	        curr.max = Math.max(curr.max , ele);
	    }
	    return curr;
	}
*/
