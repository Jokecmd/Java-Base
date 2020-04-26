package sort;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {

		int arr[] = {-1,2,-4,1,6};
		for(int i = 0;i<arr.length-1;i++) {
			int minIndex = i;
			int min = arr[i];
			for(int j = i+1;j<arr.length;j++) {		
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
