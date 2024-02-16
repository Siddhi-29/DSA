package Day2;					//SC=O(1)		TC=O(n^2)

public class Targetsum {

	public static void main(String[] args) {
		int a[] = {1,8,9,5,7};
		int target = 13;
		int diff;
		boolean state = false;
		for(int i=0 ; i<a.length ; i++) {
			if(state) {
				break;
			}
			diff = target-a[i];
			
			for(int j = i+1; j<a.length; j++) {
				if(a[j] == diff) {
					state = true;
					System.out.println("Found");
					break;
				}
				
			}
		}
		if(!state) {
			System.out.println("Not found");
		}

	}
}
