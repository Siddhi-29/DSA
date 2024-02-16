package Day3;			//SC=O(1)	TC=O(n)

public class TargetString {

	public static void main(String[] args) {
		String s = "siddhinaveen";
		String target = "navdhi";
		boolean result = true ;
		
		int[] freq = new int[26];
		for( int i=0; i<s.length(); i++) {
			freq[s.charAt(i)-'a']++;
		}
		
		for(int i=0; i<target.length(); i++) {
			
			char c = target.charAt(i);
			if(freq[c-'a']>0) {
				freq[c-'a']--;
			}
			else {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}
}
