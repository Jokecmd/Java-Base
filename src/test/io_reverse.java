package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.ReverbType;

public class io_reverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("revzzz.txt"));
		
		ArrayList<String> list = new ArrayList<String>();
		
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		
		for(int i = list.size() - 1;i >= 0;i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
