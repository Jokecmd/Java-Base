package array;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				//int num = i2 - i1;
				int num = i2.compareTo(i1);
				return num == 0 ? 1 : num;
			}
		});
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			try {
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}catch (Exception e) {
			System.out.println("录入错误");
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
}
