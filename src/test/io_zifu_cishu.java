package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class io_zifu_cishu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//带缓冲的输入流对象
		BufferedReader br = new BufferedReader(new FileReader("ccc.txt"));
		//创建双列集合
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		int ch;
		while((ch = br.read()) != -1) {
			char c = (char)ch;//向下强转
			/*
			 * if(!tm.containsKey(c)) { tm.put(c, 1); } else { tm.put(c, tm.get(c)+1); }
			 */
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c) + 1);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
		
		for(Character key : tm.keySet()) {
			switch(key) {
			case '\t':
				bw.write("\\t" + "=" + tm.get(key));
				break;
			case '\n':
				bw.write("\\n" + "=" + tm.get(key));
				break;
			case '\r':
				bw.write("\\r" + "=" + tm.get(key));
				break;
			default:
				bw.write(key + "=" + tm.get(key));
			}
			
			bw.newLine();//换行
		}
		bw.close();
		
	}

}
