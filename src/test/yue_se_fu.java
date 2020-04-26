package test;

import java.util.ArrayList;

public class yue_se_fu {

	public static void main(String[] args) {
		System.out.println(lucky(8));
		
	}
	
	public static int lucky(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =1; i<=num;i++) {
			list.add(i);
		}
		
		int count = 1;
		for (int i = 0; list.size() != 1; i++) {
			if (i == list.size()) {
				i = 0;
			}
			
			if (count %3 == 0) {
				list.remove(i--);				
			}
			
			count++;
		}
		return list.get(0);
	}

}
