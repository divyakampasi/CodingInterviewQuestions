//Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.

package Problems;

public class SmallestSubArraySum {
	
	static int smallSum(int arr[], int n, int x) {
		int min_len = n+1;
		
		for(int start =0;start<n;start++){
			int curr_sum = arr[start];
			
			if(curr_sum>x) {
				return 1;
			}
			for(int end=start+1;end<n;end++) {
				curr_sum+=arr[end];
				
				if(curr_sum>x && (end-start+1)<min_len) {
					min_len = end-start+1;
				}
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		int arr[] = {1,4,45,6,56,19};
		int x = 51;
		int result = smallSum(arr,arr.length,x);
		if(result == (arr.length+1)) {
			System.out.println("Not Possible");
		}
		else {
			System.out.println(result);
		}
	}

}
