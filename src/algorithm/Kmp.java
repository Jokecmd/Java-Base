package algorithm;

import java.util.Arrays;

public class Kmp {

	public static void main(String[] args) {
		String str = "BBCABCDABABCDABCDABDE";
		String next = "ABCDABD";
		int[] kmpNext = kmpNext(next);
		System.out.println(Arrays.toString(kmpNext));
		
		int kmpSearch = kmpSearch(str, next, kmpNext);
		System.out.println(kmpSearch);
	}

	public static int kmpSearch(String s1,String s2,int[] next) {
		for (int i = 0,j = 0; i < s1.length(); i++) {
			while(j > 0 && s1.charAt(i) !=s2.charAt(j)) {
				j = next[j - 1];
			}
			if(s1.charAt(i) == s2.charAt(j)) {
				j++;
			}
			if(j == s2.length())
				return i - j + 1;
		}
		return -1;
	}
	
	public static int[] kmpNext(String dest) {
		int[] next = new int[dest.length()];
		next[0] = 0;
		for(int i = 1,j = 0; i < dest.length(); i++) {
			while(j > 0 && dest.charAt(i) != dest.charAt(j)) {
				j = next[j - 1];
			}
			if(dest.charAt(i) == dest.charAt(j)) {
				j++;
			}
			next[i] = j;
		}
		return next;
	}
}
