//Update the Bit as per user input.

package youtubeproblems;

import java.util.Scanner;

public class UpdateBit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any decimal number ");
		int num = sc.nextInt();
		System.out.println("Enter the position you want to update");
		int pos = sc.nextInt();
		System.out.println("Enter the new bit value to update");
		int bit = sc.nextInt();
		
		int BitMask = 1<<pos;
		
		if(bit == 0) {
			int notBitMask = ~BitMask;
			
			int newnum = notBitMask & num;
			System.out.println(newnum);
		}
		else if(bit == 1) {
			int newNum = BitMask | num;
			
			System.out.println(newNum);
		}
		
		sc.close();
	}
}
