//Given a matrix of integers, task is to find out number of positional elements. 
//A positional element is one which is either minimum or maximum in a row or in a column.

package Problems;

public class PositionalElements {
	
	static int MAX = 100;
	
	static int countPositional(int a[][], int m, int n) {
		int rowmax[] = new int[m];
		int rowmin[] = new int[m];
		int colmax[] = new int[n];
		int colmin[] = new int[n];
		
		for(int i=0;i<m;i++) {
			int rminn = Integer.MAX_VALUE;
			int rmaxx = Integer.MIN_VALUE;
			for(int j =0;j<n;j++) {
				if(a[i][j]>rmaxx) {
					rmaxx = a[i][j];
				}
				if(a[i][j]<rminn) {
					rminn = a[i][j];
				}
			}
			rowmax[i] = rmaxx;
			rowmin[i] = rminn;
		}
		for(int j=0;j<n;j++) {
			int cminn = Integer.MAX_VALUE;
			int cmaxx = Integer.MIN_VALUE;
			for(int i=0;i<m;i++) {
				if(a[i][j]>cmaxx)
					cmaxx = a[i][j];
				if(a[i][j]<cminn)
					cminn = a[i][j];
			}
			colmax[j] = cmaxx;
			colmin[j] = cminn;
		}
		int count = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if((a[i][j] == rowmax[i]) || (a[i][j] == rowmin[i]) || (a[i][j] == colmax[j]) || (a[i][j] == colmin[j]))
					count++;			
			}
		}
		return count;
	}

	public static void main(String[] args) {
		    int a[][] = new int[][] { { 1, 3, 4 }, { 5, 2, 9 }, { 8, 7, 6 } }; 
	        int m = 3, n = 3; 
	        System.out.println(countPositional(a, m, n)); 

	}

}
