package sort;

import java.util.Arrays;

public class heapSort {

	public static void main(String[] args) {
		int[] arr = {4,6,8,5,9};
		heapSort(arr);		
	}
	
	public static void heapSort(int arr[]) {
		for(int i = arr.length / 2 - 1; i>=0; i--) {
			adjustHeap(arr, i, arr.length);
		}
		
		int temp = 0;
		for(int j = arr.length - 1; j>0; j--) {
			temp = arr[j];
			arr[j] = arr[0];
			arr[0] = temp;
			adjustHeap(arr, 0, j);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void adjustHeap(int[] arr, int i, int len) {
		int temp = arr[i];
		for(int k = i * 2 + 1; k < len; k = k * 2 + 1) {
			if(k+1 < len && arr[k] < arr[k+1]) {
				k++;
			}
			if(arr[k] > temp) {
				arr[i] = arr[k];
				i = k;
			}else {
				break;
			}
		}
		arr[i] = temp;
	}

}
