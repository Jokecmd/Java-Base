package regex;

import java.util.Arrays;

public class demo5_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "91 27 45 65 23";
		
		String[] sArr = s.split(" ");//以空客切割
		
		int[] arr = new int[sArr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(sArr[i]);//将数字字符串转换为数字
		}
		
		Arrays.sort(arr);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i == arr.length-1) {
				sb.append(arr[i]);
			}
			else {
				sb.append(arr[i]+" ");
			}
		}
		
		System.out.println(sb);
	}

}
