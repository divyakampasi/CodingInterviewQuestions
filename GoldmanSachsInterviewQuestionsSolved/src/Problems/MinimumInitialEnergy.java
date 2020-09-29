/*Given an array containing positive and negative numbers. 
 * The array represents checkpoints from one end to other end of street. 
 * Positive and negative values represent amount of energy at that checkpoint. 
 * Positive numbers increase the energy and negative numbers decrease.
 *  Find the minimum initial energy required to cross the street such that Energy level never becomes 0 or less than 0.
 */
package Problems;

public class MinimumInitialEnergy {
	
	static int minimumEnergy(int arr[], int n) {
			int initMinEnergy = 0;
			int currEnergy = 0;
			boolean flag = false;
			
			for(int i = 0;i<n;i++) {
				currEnergy += arr[i];
				
				if(currEnergy<=0) {
					initMinEnergy += Math.abs(currEnergy) +1;
					currEnergy = 1;
					flag = true; 
				}
			}
			
			return (flag == false)? 1 : initMinEnergy;
	}
	

	public static void main(String[] args) {
		int arr[] = {4, -10, 4, 4, 4};
		int n = arr.length;
		System.out.print(minimumEnergy(arr,n));

	}

}
