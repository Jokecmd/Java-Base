package sort;

import java.util.Arrays;

public class radixSort {

	public static void main(String[] args) {
		int arr[] = {53,3,542,748,14,23,457};
		radixSort(arr);
	}
	
	
	public static void radixSort(int[] arr) {
		int bucket[][] = new int[10][arr.length];
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		int maxLenght = (max + "").length();
		
		int[] buckElementsCounts = new int[10];
		
		for(int i = 0 , n = 1; i < maxLenght; i++, n *= 10) {
			for(int j = 0; j < arr.length; j++) {
				int digitOfElments = arr[j] / n % 10;
				bucket[digitOfElments][buckElementsCounts[digitOfElments]] = arr[j];
				buckElementsCounts[digitOfElments]++;
			}
			int index = 0;
			for(int k = 0; k < buckElementsCounts.length; k++) {
				if(buckElementsCounts[k] != 0) {
					for(int l = 0; l < buckElementsCounts[k]; l++) {
						arr[index++] = bucket[k][l];
					}
				}
				buckElementsCounts[k] = 0;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
