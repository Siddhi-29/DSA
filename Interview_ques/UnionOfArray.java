package Interview_ques;

import java.util.ArrayList;

public class UnionOfArray {

	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5, 8, 10} ; 
		int arr2[] = {1, 2, 3, 6, 7, 15, 22, 56, 77, 90};
		
		int n = arr1.length;
		int m = arr2.length;
		
		ArrayList<Integer> list = UnionOfArray.findUnion(arr1, arr2, n, m);
		
		System.out.println(list);
	}
	
	    //Function to return a list containing the union of the two arrays.
	    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
	    {
	        // add your code here
	        ArrayList <Integer> list = new ArrayList<>();
	        
	        int prev = Integer.MIN_VALUE;
	        int curr = 0;
	        int first = 0;
	        int second = 0;
	        
	        while(first<n && second<m)
	            {
	            if(arr1[first] == arr2[second]){
	                curr = arr1[first];
	               // list.add(arr1[first]);
	                first++; 
	                second++;
	            }
	            else if(arr1[first] < arr2[second]){
	                  curr = arr1[first];
	               // list.add(arr1[first]);
	                first++;
	            }
	            else if(arr1[first]>arr2[second]){
	                  curr = arr2[second];
	               // list.add(arr2[second]);
	                second++;
	            }
	            if(curr == prev)
	                continue;
	            prev = curr;
	            list.add(curr);
	                
	        }
	        if(first == n){
	            for(int i=second; i<m; i++){
	                curr = arr2[i];
	                if(curr == prev)
	                    continue;
	                prev = curr;
	                list.add(curr);
	              //  list.add(arr2[i]);
	            }
	        }
	        else{
	            for(int i = first; i<n; i++){
	                curr = arr1[i];
	                if(curr == prev)
	                    continue;
	                prev = curr;
	                list.add(curr);
	                //list.add(arr1[i]);
	            }
	        }
	        
	        return list;
	        
	    }
	}

