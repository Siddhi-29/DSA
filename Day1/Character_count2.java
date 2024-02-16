package Day1;			//SC=O(1)	TC=O(n)

public class Character_count2 {

	public static void main(String[] args) {

		char[] arr = {'a','a','b','c','c','c','d','d'};
		int count = 0;
		char curr = arr[0];

		for( int i=0; i<arr.length; i++) {
			
			if(arr[i] == curr) {
				count++;

			}
			else {
				System.out.println(curr + " : " + count);
				curr = arr[i];
				count = 1;

			}
			
			if(i == arr.length-1) {
				System.out.println(curr + " : " + count);
			}
		}
	}
}
/*
Problem2: Write a program to print the occurrence with that character , in a character in array. 

Input : [ a , a , b , c , c , c , d , d]
Output : 
a : 2
b : 1
c : 3 
d : 2
 */
