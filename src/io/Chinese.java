package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chinese {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//demo1();
		FileOutputStream f2 = new FileOutputStream("zzz.txt");
		f2.write("666".getBytes());
		
		f2.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream f1 = new FileInputStream("yyy.txt");
		byte[] arr = new byte[3];
		int len;
		while((len = f1.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
			
		}
		f1.close();
	}

}
