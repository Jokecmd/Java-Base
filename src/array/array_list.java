package array;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();

		list.add(new Person("zas",12));
		list.add(new Person("zas",12));
		list.add(new Person("zas",12));
		list.add(new Person("zas",12));
		
		
		ArrayList newlist = getSingle(list);
		
		System.out.println(newlist);
	}
	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList<>();
		Iterator it = list.iterator();
		
		
		  while(it.hasNext()) { Object obj = it.next(); if(!newList.contains(obj)) {
		  newList.add(obj); } }
		 
		/*
		 * for (Object obj : newList) { if(!newList.contains(obj)) { newList.add(obj); }
		 * }
		 */
		return newList;
	}

}
