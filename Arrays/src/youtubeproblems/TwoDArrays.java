//Taking a matrix as an input and printing its elements

package youtubeproblems;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no. of columns");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];

		System.out.println("Enter elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}
