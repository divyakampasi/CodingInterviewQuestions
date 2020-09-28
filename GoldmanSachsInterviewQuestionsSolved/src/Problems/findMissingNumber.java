package Problems;

public class findMissingNumber {
	
	static int findmissing(int [] ar, int N) 
	{ 
	      
	    int l = 0, r = N - 1; 
	    while (l <= r)  
	    { 
	        int mid = (l + r) / 2; 
	       
	       
	        if (ar[mid] != mid + 1 && ar[mid - 1] == mid) {
	            return (mid + 1); 
	        }

	        if (ar[mid] != mid + 1){
	            r = mid - 1; 
	        }
	        else{
	             l = mid + 1; 
	        }
	           
	    } 

	return -1; 
	} 

	public static void main(String[] args) {
		    int arr[] = {1, 3, 4, 5, 6, 7, 8}; 
		    int N = arr.length; 
		    System.out.println(findmissing(arr, N)); 

	}

}
