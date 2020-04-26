package array;

import java.util.HashSet;
import java.util.Scanner;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		HashSet<Character> hs = new HashSet<Character>();
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		for (char c : arr) {
			hs.add(c);
		}
		
		for (char ch : hs) {
			System.out.print(ch);
		}
	}

}
