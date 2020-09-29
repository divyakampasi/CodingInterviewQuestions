package SortingAlgorithms;

public class InsertionSort {
	
	void sort(int arr[]) {
			int n = arr.length;
			for(int i=1;i<n;++i) {
				int key = arr[i];
				int j = i-1;
				
				while(j>=0 && arr[j]>key) {
					arr[j+1] = arr[j];
					j  = j-1;
				}
				arr[j+1] = key;
			}
	}
	
	static void printArray(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {12,11,3,8,5,21,1,17,10};
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		
		System.out.println("Sorted Array :");
		printArray(arr);

	}

}
