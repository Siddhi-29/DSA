//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package youtubeProblems;

import java.util.Scanner;

public class ArrayOfStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			int a = i + 1;
			System.out.println("Enter string " + a + " : ");
			arr[i] = sc.nextLine();
		}

		System.out.println("Array of Strings is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int length = 0;
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < size; i++) {
			stringBuilder.append(arr[i]);
		}

		length = stringBuilder.length();

		System.out.println("Total length: " + length);
		
		sc.close();
	}
}
