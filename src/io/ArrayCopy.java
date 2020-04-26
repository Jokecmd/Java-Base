package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArrayCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream("xxx.txt");
		FileOutputStream f2 = new FileOutputStream("yyy.txt");
		
		byte[] arr = new byte[1024 * 8];//小数组拷贝
		int len;
		while((len = f1.read()) != -1) {
			f2.write(arr,0,len);
		}
		f1.close();
		f2.close();
	}

}
