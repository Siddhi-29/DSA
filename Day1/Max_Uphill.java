package Day1;			//SC=O(1)		TC=O(n)

public class Max_Uphill {

	public static void main(String[] args) {

		int arr [] = {10,15,9,12,25};
		System.out.println(maxUphill(arr));

	}
	public static int maxUphill(int arr[]){

		int max = Integer.MIN_VALUE;	
		int count = 1; 
		for(int i =0; i<arr.length; i++) {

			if(i == arr.length-1) {
				max = Math.max(count,  max);
				break;
			}
			if(arr[i]<arr[i+1]) {
				count++;
			}

			else {

				max = Math.max(max, count);
				count = 1;
			}
		}
		return max;
	}
}

/*
Problem3: Find maximum uphill:{

Input:[10,15,9,12,25]
Output:

 */