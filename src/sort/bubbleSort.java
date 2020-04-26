package sort;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int arr[] = {-1,-3,7,3,10,2};
		int temp = 0;
		boolean flag = false;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false) {
				break;
			}else {
				flag = false;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
