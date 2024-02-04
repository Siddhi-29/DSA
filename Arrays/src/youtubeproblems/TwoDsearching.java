//Searching for an element x in a matrix

package youtubeproblems;

import java.util.Scanner;

public class TwoDsearching {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no. of cols");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter the elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the number to be searched:");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == x) {
					System.out.println(x + " found at matrix[" + i + "][" + j + "]");
				}
			}
		}

		sc.close();

	}
}
