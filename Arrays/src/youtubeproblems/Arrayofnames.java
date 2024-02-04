//Take an array of names as input from the user and print them on the screen.

package youtubeproblems;

import java.util.Scanner;

public class Arrayofnames {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		String names[] = new String[size];

		System.out.println("Enter array elements");
		// input
		for (int i = 0; i < size; i++) {
			names[i] = sc.next();
		}

		// output
		for (int j = 0; j < size; j++) {
			System.out.println(names[j]);
		}

		sc.close();

	}
}
