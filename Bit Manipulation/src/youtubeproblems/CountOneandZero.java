//Write a program to count the number of 1’s in a binary representation of the number.

package youtubeproblems;

import java.util.Scanner;

public class CountOneandZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer: ");
		int number =sc.nextInt();
		
		int count = countOnes(number);
		System.out.println("No. of 1s: "+count);
		
		int count2 = countZeroes(number);
		System.out.println(" No. of 0's: "+count2);
		sc.close();
	}
	
	static int countOnes(int num) {
		int count =0;
		while(num != 0) {
			count += num & 1;
			
			num = num >> 1;
		}
		return count;
	}
	
	static int countZeroes(int num) {
		int count =0;
		while(num != 0) {
			if((num & 1) == 0) {
				count++;
			}
			
			num = num >> 1;
		}
		return count;
	}
	
	
}
