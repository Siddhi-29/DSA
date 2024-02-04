//Set the bit at given pos. as 1.

package youtubeproblems;

public class SetBit {

	public static void main(String[] args) {
		
		int num = 5; //0101
		int pos = 1;		//7 = 0111
		int BitMask = 1<<pos;
		
		int newNum = BitMask | num;
		
		System.out.println(newNum);
	}
}
