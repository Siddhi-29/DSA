package Interview_ques;

public class KadanesAlgo {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,-2,5};
		int[] arr2 = {-1,-2,-3,-4};
		
		long sum = KadanesAlgo.maxSubarraySum(arr1, arr1.length);
		System.out.println(sum);
		long sum2 = KadanesAlgo.maxSubarraySum(arr2, arr1.length);
		System.out.println(sum2);
		
	}
	
	static long maxSubarraySum(int arr[], int n){
		
		int maxSum = arr[0];
		int currSum = 0;
		
		for(int i:arr) {
			
			currSum += i;
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum<=0) {
				currSum=0;
			}
		
		}
		
		return maxSum;
	}
}
