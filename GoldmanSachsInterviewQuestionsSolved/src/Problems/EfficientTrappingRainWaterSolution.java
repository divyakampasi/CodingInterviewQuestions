//Time Complexity: O(n) Space Complexity : O(n)

package Problems;

public class EfficientTrappingRainWaterSolution {
	
	static int findWater(int arr[], int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		int water = 0;
		
		left[0]= arr[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		right[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			water+=Math.min(left[i],right[i])-arr[i];
		}
		
		return water;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3,0,2,0,4,0,6}; 
		System.out.println("Maximum water that can be accumulated is " + findWater(arr, arr.length));
	}
}
