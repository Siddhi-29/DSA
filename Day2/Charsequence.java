package Day2;			//SC=O(1)		TC=O(n)

import java.util.Scanner;
public class Charsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		int i = 1;
		while(i<=5) {
			System.out.println((char)(c+i));
			i++;
		}

	}
}
