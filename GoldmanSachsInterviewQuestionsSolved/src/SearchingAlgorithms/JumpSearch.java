//Time Complexity : O(Root(n))

package SearchingAlgorithms;

public class JumpSearch {
	
	static int search(int arr[], int x) {
		
		int n = arr.length;
		int step = (int)Math.floor(Math.sqrt(n));
		
		int prev = 0;
		while(arr[Math.min(step,n)-1]<x) {
			prev=step;
			step+=(int)Math.floor(Math.sqrt(n));
			if(prev>=n) {
				return -1;
			}
		}
		
		while(arr[prev]<x) {
			prev++;
			if(prev==Math.min(step,n))
				return prev;
		}
		
		if(arr[prev]==x)
			return prev;
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610}; 
		int x = 55;		
		int result = search(arr, x);		
		if(result == -1) {
			System.out.println("Element not found anywhere");
		}
		else {
			System.out.println("Element found at position : "+result);
		}
	}

}
