package search;

public class binarySearchNoRecur {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int binarySearch = binarySearch(arr, 4);
		System.out.println(binarySearch);
	}
	
	public static int binarySearch(int[] arr,int target) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}			
		}
		return -1;
	}

}
