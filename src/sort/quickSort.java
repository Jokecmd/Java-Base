package sort;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		int[] arr = {8,9,1,7,2,3,5,4,6,0};
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr,int left,int right) {
		int l = left;
		int r = right;
		int pivot = arr[(left + right) / 2];
		int temp = 0;
		while(l < r) {
			while(arr[l] < pivot) {
				l++;
			}
			while(arr[r] > pivot) {
				r--;
			}
			if(l >= r) {
				break;
			}
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
		}
		if(l == r) {
			l++;
			r--;
		}
		if(left < r) {
			quickSort(arr, left, r);
		}
		if(right > l) {
			quickSort(arr, l, right);
		}
		System.out.println(Arrays.toString(arr));
	}

}
