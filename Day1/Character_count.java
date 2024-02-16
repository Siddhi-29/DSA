package Day1;			//SC=O(n)    TC=O(n)

import java.util.ArrayList;
import java.util.Scanner;

public class Character_count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of char array: ");
		int n =sc.nextInt();
		char[] arr = new char[n];
		System.out.println("Enter the array elements: ");
		for( int i=0; i<n; i++) {
			
			arr[i]=sc.next().charAt(0);
		}
		//char[] arr = {'a','a','b','c','c','c','d','d'};

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		ArrayList<Integer> occur = new ArrayList<>(); 
		int count=0;
		char curr = arr[0];

		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == curr) {
				count++;

			}
			else {
				occur.add(count);
				curr = arr[i];
				count = 1;
			}

			if(i == arr.length-1) {
				occur.add(count);

			}

		}
		System.out.println(occur);

		sc.close();
	}
}
/*Problem1: Write a program to print the occurrence of a character in array.

Input : [ a , a , b , c , c , c , d , d]
Output : 2 , 1 , 3 , 2
 */