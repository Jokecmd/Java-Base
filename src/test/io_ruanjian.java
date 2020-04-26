package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class io_ruanjian {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		
		String line = br.readLine();
		
		int times = Integer.parseInt(line);
		if(times > 0) {
			System.out.println("您还有" + times +"次机会");
			FileWriter fw = new FileWriter("xxx.txt");
			fw.write(times + "");
			fw.close();
		}
		else {
			System.out.println("试用次数已用完");
		}
		br.close();
		
	}

}
