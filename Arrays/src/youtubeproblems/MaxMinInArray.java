//Find the maximum & minimum number in an array of integers

package youtubeproblems;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest Number is : " + max);
		System.out.println("Smallest Number is : " + min);

		sc.close();

	}
}
