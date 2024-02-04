//Get the bit at given position.

package youtubeproblems;

public class GetBit {

	public static void main(String[] args) {
		
		int n = 5;	//0101
		int pos = 1;
		int BitMask = 1<<pos;//0001   0010
		
		if((BitMask & n) == 0) {
			System.out.println(" Bit was zero");
		}
		else {
			System.out.println(" Bit was one");
		}
		
	}
}
