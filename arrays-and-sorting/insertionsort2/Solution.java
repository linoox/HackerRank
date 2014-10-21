import java.util.Arrays;


//TODO - modify for submission.
public class Solution {

	static void printArray(int[] ar) {

		for (int i=0;i<ar.length;i++) {
			if(i>0) 
				System.out.print(" ");
			System.out.print(ar[i]);
		}
		System.out.println();
	}


	// Insertion sort - CLRS
	public static void insertionSort(int[] ar) {

		int len = ar.length;
		//System.out.println("arr:"+Arrays.toString(arr));
		printArray(ar);
		for (int j=2; j< len;j++) {
			int key = ar[j];
			int i = j-1;
			while (i >0 && ar[i] > key) {
				ar[i+1] = ar[i];
				i = i-1;
			}
			ar[i+1]=key;
			//System.out.println("arr:"+Arrays.toString(arr));
			printArray(ar);
		}
	}

	/*
	public static void main(String[] args) {

		int[] arr = {1, 4, 3, 5, 6, 2};
		insertionSort(arr);
	}
	*/
}