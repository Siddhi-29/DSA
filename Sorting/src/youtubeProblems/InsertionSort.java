package youtubeProblems;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {10, 0, 9, 7, 8, 3, 1, 2 };

		// for unsorted part
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int j = i - 1;

			while (j >= 0 && curr < arr[j]) {// for sorted part
				arr[j+1] = arr[j];
				j--;
			}
			
			//place the number in its correct position
			arr[j+1] = curr;
		}
		
		printArr(arr);
	}
	
	public static void printArr(int a[]) {
		for( int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
