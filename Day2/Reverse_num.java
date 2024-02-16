package Day2;		//SC=O(1)		TC=O(n)
import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int rem;
		
		while(n > 0) {
			rem = n%10;
			temp = (temp * 10)+rem;
			n = n/10;
		}
		
		System.out.println(temp);
		sc.close();
	}
}

/*
 * num = 12345
 * temp = 0
 * rem = 5
 * temp = temp*10+rem
 * num/10
 * till num>0
*/