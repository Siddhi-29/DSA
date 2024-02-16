package Day3;				//SC=O(n)     TC=O(n)

import java.util.HashMap;

public class Target_string {

	public static void main(String[] args) {

		String s = "siddhinaveen";
		String target = "navdhi";
		boolean result =true ;

		HashMap<Character, Integer> map = new HashMap<>();
		for( int i=0; i<s.length(); i++) {

			char ch = s.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 0);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}	
		}
		for(int i=0; i<target.length(); i++) {
			char c = target.charAt(i);
			if(map.containsKey(c)) {
				if(map.get(c) == 1) {
					map.remove(c);
				}
				else {
					map.put(c, map.get(c)-1);
				}
			}
			else {
				result = false;
			}
		}
		System.out.println(result);
		
	}
}
/*
 * target = "navdhi"
 * map={(s,1),(i,2),(d,2),...(n,2)......}
 * 
 */
