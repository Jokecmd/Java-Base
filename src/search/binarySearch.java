package search;

import java.util.ArrayList;
import java.util.List;

public class binarySearch {

	public static void main(String[] args) {
		int arr[] = {1,4,7,23,45,78,90};
		List<Integer> binarySearch = binarySearch(arr, 0, arr.length - 1, 90);
		System.out.println(binarySearch);
	}
	
	public static List<Integer> binarySearch(int[] arr,int left,int right,int findval) {
		if(left > right) {
			return new ArrayList<Integer>();
		}
		int mid = (left + right) / 2;
		int midval = arr[mid];
		
		if(findval > midval) {
			return binarySearch(arr, mid + 1, right, findval);
		}
		else if (findval < midval) {
			return binarySearch(arr, left, mid - 1, findval);
		}
		else {
			List<Integer> res = new ArrayList<Integer>();
			int temp = mid - 1;
			while(true) {
				if(temp < 0 || arr[temp] != findval) {
					break;
				}
				res.add(temp);
				temp--;
			}
			res.add(mid);
			
			temp = mid + 1;
			while(true) {
				if(temp > arr.length - 1 || arr[temp] != findval) {
					break;
				}
				res.add(temp);
				temp++;
			}
			return res;
		}
	}

}
