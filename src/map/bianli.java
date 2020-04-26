package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bianli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("利丝", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象并存储在Set集合中
		/*Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> en = it.next();
			
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
			*/
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
			
		}
		
}

}
