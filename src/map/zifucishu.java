package map;

import java.awt.RenderingHints.Key;
import java.util.HashMap;

public class zifucishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaaaccccddddsssseeee";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		/*
		 * for(char c : arr) { if(!hm.containsKey(c)) { hm.put(c,1); }else {
		 * hm.put(c,hm.get(c)+1); } }
		 */
		for(char c : arr) {
			hm.put(c,!hm.containsKey(c) ? 1 : hm.get(c)+1);
	 
		}
		for (char key : hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
