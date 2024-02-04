//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package youtubeproblems;

import java.util.Scanner;

public class ArrayofStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array of strings: ");
		int size = sc.nextInt();
		String[] array = new String[size];
		sc.nextLine();
		int length = 0;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter string "+i);
			array[i] = sc.nextLine();
		}
		System.out.print("Array of Strings is :");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < size; i++) {
			length = length + array[i].length();
		}
		System.out.println("Combined length of all strings is: " + length);
		
		sc.close();

	}
}
