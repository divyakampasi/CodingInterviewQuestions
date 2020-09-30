// Java Program to find sum of Manhattan distance 
// between all the pairs of given points 

//Time Complexity: O(n^2)

package Problems;

public class ManhattanPoints {
	
	static int distanceSum(int x[], int y[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum+=(Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j]));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int x[] = {-1,1,3,2};
		int y[] = {5,6,5,3};
		
		int n = x.length;
		System.out.println(distanceSum(x,y,n));

	}

}
