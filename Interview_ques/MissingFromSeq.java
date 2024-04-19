package Interview_ques;

public class MissingFromSeq {

	public static void main(String[] args) {
		
		MissingFromSeq ans = new MissingFromSeq();
		int a[] = {1,2,3,5};
		int n = 5;
		
		int missing = ans.missingNumber(a, n);
		
		System.out.println(missing);
	}
	
	int missingNumber(int array[], int n) {
	     // Your Code Here
	     
	     int sum=(n*(n+1))/2;
	     int s=0;
	        
	    for(int i=0;i<n-1;i++)
	        s+=array[i];
	    return(sum-s);   
	        
	    }
}
