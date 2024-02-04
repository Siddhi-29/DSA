//Clears the bit at given pos and make it 0

package youtubeproblems;

public class ClearBit {

	public static void main(String[] args) {
		
		int num = 5; 	//0101
		int pos = 2;
		int BitMask = 1<<pos;//0001     1011
		int notBitMask = ~BitMask;
		
		int newnum = notBitMask & num;
		System.out.println(newnum);
	}
}
