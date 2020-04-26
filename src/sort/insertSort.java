package sort;

import java.util.Arrays;

public class insertSort {

	public static void main(String[] args) {
		int[] arr = {-1,3,2,6,-4};
		int insertVal = 0;
		int insertIndex = 0;
		for(int i = 1;i < arr.length; i++) {
			insertVal = arr[i];
			insertIndex = i-1;
			while(insertIndex>=0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			if(insertIndex != i-1) {
				arr[insertIndex + 1] = insertVal;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
