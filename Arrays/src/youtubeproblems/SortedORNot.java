//Take an array of numbers as input and check if it is an array sorted in ascending order

package youtubeproblems;

import java.util.Scanner;

public class SortedORNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		// input
		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		boolean isAscending = true;

		for (int i = 0; i < arr.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition

			if (arr[i] > arr[i + 1]) { // This is the condition for descending order

				isAscending = false;

			}

		}
		if (isAscending) {
			System.out.println(" Array elements are in ascending order ");
		} else {
			System.out.println(" Array elements are in descending order ");
		}

		sc.close();

	}
}
