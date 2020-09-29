	//Time Complexity : O(logN)
	
	package SearchingAlgorithms;
	
	public class BinarySearch {
		
		int search(int arr[], int l, int r, int x) {
			if(l<=r) {
				int mid = l+(r-l)/2;
				
				if(arr[mid]==x) {
					return mid;
				}
				if(arr[mid]>x) {
					return search(arr,l,mid-1,x);
				}
				return search(arr,mid+1,r,x);					
			}
			return -1;
		}
		
		public static void main(String[] args) {
			
			BinarySearch ob = new BinarySearch();
			int arr[] = {1,7,11,22,23,39,45,54};
			int x = 22;
			int result = ob.search(arr,0,arr.length-1,x);
			if(result == -1) {
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found at position : "+result);
			}
		}
	
	}
