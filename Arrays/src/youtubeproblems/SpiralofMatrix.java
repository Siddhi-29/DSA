package youtubeproblems;

import java.util.*;

public class SpiralofMatrix {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter no. of rows");
//		int rows = sc.nextInt();
//		System.out.println("Enter no. of cols");
//		int cols = sc.nextInt();

		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
//
//		System.out.println("Enter the elements");
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
		int rows = 4;
		int cols = 3;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int left = 0;
		int right =cols-1;
		int up = 0;
		int down = rows-1;
		
		while(list.size() < rows*cols) {
			for( int i=left; i<=right; i++) {
				list.add(matrix[up][i]);
			}
			up++;
			
			for( int i=up; i<=down; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			
			for( int i=right; i>=left; i--) {
				list.add(matrix[down][i]);
			}
			down--;
			
			for( int i=down; i>=up; i--) {
				list.add(matrix[i][left]);
			}
			left++;
		}
		
		System.out.println(list);

		sc.close();

	}
}
