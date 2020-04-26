package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class test_quchong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		getSingle(list);
		
		System.out.println(list);
		
	}

	private static void getSingle(List<String> list) {
		// TODO Auto-generated method stub
		HashSet<String> lhs = new HashSet<String>();
		
		lhs.addAll(list);
		
		list.clear();
		
		list.addAll(lhs);
	}

}
