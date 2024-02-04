//Write a program to find if a number is a power of 2 or not.
//A power of 2 in binary has only one bit set to 1. For example, 2 (binary: 10), 4 (100), 8 (1000)
//If there is only one set bit in num, this operation will result in 0.
//This is because the rightmost set bit in num is toggled off by num - 1.

package youtubeproblems;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		if(isPowerOFTwo(num)) {
			System.out.println("Power of 2 ");
		}
		else {
			System.out.println("Not a power of 2 ");
		}
		sc.close();
		
	}
	static boolean isPowerOFTwo(int num) {
		return num>0 && (num&(num-1)) == 0;
	}
}
