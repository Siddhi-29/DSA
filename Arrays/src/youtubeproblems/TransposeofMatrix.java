//For a given matrix of N x M, print its transpose.

package youtubeproblems;

import java.util.Scanner;

public class TransposeofMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int n = sc.nextInt();
		System.out.println("Enter no. of columns");
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];

		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Transpose of Matrix :");

		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}
