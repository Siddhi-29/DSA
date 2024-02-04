//Input a string from the user.
//Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

package youtubeProblems;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
	
		for( int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)=='e') {
				sb.setCharAt(i, 'i');
			}
		}
		
		String result = sb.toString();
		System.out.println("Result String: "+result);
		
		sc.close();
	}
}
