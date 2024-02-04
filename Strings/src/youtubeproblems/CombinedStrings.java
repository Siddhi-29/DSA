//Take 2 Strings input from the user & find the cumulative (combined) length.

package youtubeproblems;

import java.util.Scanner;

public class CombinedStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter 2 strings:");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int length = str1.length()+str2.length();
		System.out.println("Total length is : "+length);
		
		sc.close();
	}
}
