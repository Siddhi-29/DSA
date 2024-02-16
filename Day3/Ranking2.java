package Day3;			//SC=O(n)	TC=O(nlogn)

import java.util.Arrays;
import java.util.HashMap;

public class Ranking2 {

	public static void main(String[] args) {
		
		int[] a = { 9 , 4 , 1 , 8 , 10 , 0};
		int[] res = new int[a.length];
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for( int i=0; i<a.length; i++) {
			map.put(a[i], i);
		}
		Arrays.sort(a);
		int rank = a.length;
		int index = -1;
		for(int i=0; i<res.length; i++) {
			index = map.get(a[i]);
			res[index] = rank;
			rank--;
		}
		System.out.println(" Using HASHMAP ");
		for(int i=0; i<res.length; i++) {
			
			System.out.print(" "+res[i]+" ");
		}
		
	}
}


/*
Input :  [ 9 , 4 , 1 , 8 , 10 , 0] 
{(9,0),(4,1),.........}


[0,1,4,8,9,10]
[ , , , , ,6]
Output : [ 2 , 4 , 5 , 3 , 1 , 6 ]

currmax= 9, 0
currmax =10,4

 */