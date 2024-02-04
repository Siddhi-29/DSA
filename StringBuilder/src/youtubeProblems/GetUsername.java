//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’.
//Display that username to the user.

package youtubeProblems;

import java.util.Scanner;

public class GetUsername {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email of the user: ");
		String email = sc.next();
		StringBuilder sb = new StringBuilder(email);
		
		for( int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == '@') {
				sb.delete(i,sb.length());
			}
		}
		System.out.println("Username: "+sb);
		
		sc.close();
	}
}
