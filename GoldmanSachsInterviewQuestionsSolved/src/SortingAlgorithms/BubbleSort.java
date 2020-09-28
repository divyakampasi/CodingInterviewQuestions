package SortingAlgorithms;

public class BubbleSort {
	
	void sort(int arr[]) {
		int n =arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {17,5,8,4,12,1,19,15};
		BubbleSort ob = new BubbleSort();
		ob.sort(arr);
		
		System.out.println("Sorted Array : ");
		printArray(arr);
	}

}
