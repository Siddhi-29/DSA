//Write a program to toggle a bit a position = “pos” in a number “n”.
//(0 ^ 1 = 1, and 1 ^ 1 = 0)

package youtubeproblems;

import java.util.Scanner;

public class ToggleBit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the position to toggle the bit");
		int pos = sc.nextInt();
		
		int result = toggleBit(num,pos);
		System.out.println("Result: "+result);
		
		sc.close();
	}
	static int toggleBit(int num, int pos) {
		return num ^ (1<<pos);
	}
	
}
