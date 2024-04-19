package Interview_ques;

import java.util.HashMap;

public class ArraySubset {

	public static void main(String[] args) {
		
		ArraySubset obj = new ArraySubset();
		long a1[] = {11, 5, 10, 2, 1, 3, 7, 17, 7};
		long a2[] = {10, 7, 17, 11, 3};
		long a3[] = {10, 2, 3, 17, 17, 1};
		
		String ans = obj.isSubset(a1, a2, 9, 5);
		String ans2 = obj.isSubset(a1, a3, 9, 6);
		
		System.out.println(ans);
		System.out.println(ans2);
	}
	
	public String isSubset(long a1[], long a2[], long m, long n) {
		
		HashMap<Long, Integer> map = new HashMap<>();
		
		for(long i:a1) 
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(long j:a2) {
			if(map.getOrDefault(j,0)>0) 
			{
				map.put(j, map.get(j)-1);
			}
			else {
				return "No";
			}
		}
		
		return "Yes";
	}
}

