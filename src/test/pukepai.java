package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pukepai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] num = {"A","2","3","4","5","6","7","8","9","j","q","k"};
	
		String[] color = {"红桃","梅花","黑桃","方块"}; 
	
		ArrayList<String> poker = new ArrayList<String>();
		
		for (String s1 : color) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
				
			}
			
		}
		poker.add("小王");
		poker.add("大王");
		
		Collections.shuffle(poker);
		
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<String> arr3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
	
		for(int i=0;i<poker.size();i++)
		{
			if(i>=poker.size()-3) {
				dipai.add(poker.get(i));
			}
			else if(i % 3 == 0) {
				arr1.add(poker.get(i));
			}
			else if(i % 3 == 1) {
				arr2.add(poker.get(i));
			}
			else {
				arr3.add(poker.get(i));
			}
		}
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(dipai);
		
	}

}
