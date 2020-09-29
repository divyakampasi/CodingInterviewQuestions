package SortingAlgorithms;

public class MergeSort {
	
	void merge(int arr[],int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[m+1+j];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;		
		}
		
	}
	
	void sort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+(r-1))/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,22,54,10,7,8,9,1,5};
		int n = arr.length;
		
		MergeSort ob = new MergeSort();
		ob.sort(arr,0,n-1);
		
		System.out.println("Sorted Array :");
		printArray(arr);


	}

}
