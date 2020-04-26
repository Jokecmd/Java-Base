package array;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		
		TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				//int num = c1-c2;
				int num = c1.compareTo(c2);
				return num == 0 ? 1 : num;
			}
		});
		
		for (char c : arr) {
			ts.add(c);
		}
		
		for(Character c : ts)
			System.out.print(c);
	}

}
