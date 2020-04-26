package algorithm;

public class violentMatch {

	public static void main(String[] args) {
		String s1 = "abcdefg";
		String s2 = "def";
		int index = Match(s1, s2);
		System.out.println(index);
	}

	public static int Match(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		int len1 = s1.length;
		int len2 = s2.length;
		
		int i = 0;
		int j = 0;
		while(i<len1 && j<len2) {
			if(s1[i] == s2[j]) {
				i++;
				j++;
			}else {
				i = i - (j - 1);
				j = 0;
			}
		}
		if(j == len2) {
			return i - j;
		}else {
			return -1;
		}
	}
}
