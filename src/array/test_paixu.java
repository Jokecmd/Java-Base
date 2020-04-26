package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class test_paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("fff");
		list.add("java");
		list.add("bb");
		list.add("nb");
		list.add("sb");
		list.add("ccc");
		
		sort(list);
		
		System.out.println(list);
	}

	//排序并保留重复
	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				int num = s1.compareTo(s2);
				
				return num == 0 ? 1:num;
			}
			
		});
		ts.addAll(list);
		
		list.clear();
		
		list.addAll(ts);
		
	}

}
