package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pukepai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] num = {"3","4","5","6","7","8","9","10","j","q","k","A","2"};
		
		String[] color = {"红桃","梅花","黑桃","方块"}; 
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();//储存索引和扑克牌
		ArrayList<Integer> list = new ArrayList<Integer>();//存储索引
		int index = 0;
		//拼接扑克牌
		for(String s1 : num) {
			for(String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		
		Collections.shuffle(list);
		
		TreeSet<Integer> tr1 = new TreeSet<Integer>();
		TreeSet<Integer> tr2 = new TreeSet<Integer>();
		TreeSet<Integer> tr3 = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
	
		for(int i = 0;i<list.size();i++)
			if(i>=list.size()-3) {
				dipai.add(list.get(i));
			}
			else if(i % 3 == 0) {
				tr1.add(list.get(i));
			}
			else if(i % 3 == 1) {
				tr2.add(list.get(i));
			}
			else {
				tr3.add(list.get(i));
			}
	
		lookPoker(hm, tr1, "1");
		lookPoker(hm, tr2, "2");
		lookPoker(hm, tr3, "3");
		lookPoker(hm, dipai, "4");
	}
	
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts,String name) {
		
		for (Integer i : ts) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}
	
}
