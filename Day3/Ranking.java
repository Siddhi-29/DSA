package Day3;				//SC=O(n)   TC=n^2

public class Ranking {

	public static void main(String[] args) {

		int max = Integer.MAX_VALUE;
		int[] a = { 9 , 4 , 1 , 8 , 10 , 0};
		int[] res = new int[a.length];
		int rank = 1;

		for(int i=0; i<a.length; i++) {
			int index = getIndex(a,max);
			res[index] = rank;
			rank++;
			max = a[index];

		}

		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static int getIndex(int[]a, int max) {
		int currmax = Integer.MIN_VALUE;
		int index = -1;
		for( int i=0; i<a.length; i++) {

			if(a[i] > currmax && a[i] < max)
			{
				currmax = a[i];
				index = i;
			}

		}

		return index;
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