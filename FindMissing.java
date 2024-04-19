package Interview_ques;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class FindMissing {
	
	public static void main(String[] args) {
		
		FindMissing finder = new FindMissing();
		
		int a[] = {4, 3, 5, 9, 11};
		int n = a.length;
		int b[] = {4, 9, 3, 11, 10};
		int m = b.length;
		
		ArrayList<Integer> missing = finder.findMissing(a, b, n, m);
		System.out.println(missing);
	}


    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
    	ArrayList<Integer> res = new ArrayList<>();
    	HashSet<Integer> set = new HashSet<>();
    	
    	for(int i:b) {
    		set.add(i);
    	}
    	
    	for(int j:a) {
    		if(!set.contains(j)) {
    			res.add(j);
    		}
    	}
    	
    	return res;
    }
     
}
