package map;

import java.util.HashMap;

public class qiantao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student,String> hm88 = new HashMap<>();
		hm88.put(new Student("张三",23),"背景");
		hm88.put(new Student("利丝",243),"背景");
		hm88.put(new Student("王五",253),"背景");
		hm88.put(new Student("赵六",263),"背景");
	
	
		HashMap<Student,String> hm89 = new HashMap<>();
		hm89.put(new Student("张",23),"背景");
		hm89.put(new Student("利",243),"背景");
		hm89.put(new Student("王",253),"背景");
		hm89.put(new Student("赵",263),"背景");
	
		HashMap<HashMap<Student,String>, String> hm = new HashMap<HashMap<Student,String>, String>();
	
		hm.put(hm88,"88");
		hm.put(hm89,"89");
		
		for (HashMap<Student,String> hp : hm.keySet()) {
			String value = hm.get(hp);
			for (Student key : hp.keySet()) {
				String value2 = hp.get(key);
				
				System.out.println(key + "=" + value2 + "=" + value);
			}
		}
	}
	
	

}
