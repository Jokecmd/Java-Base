package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	/*
	 * 为什么返回是int而不是byte
	 * 因为字节输入流可以操作任意类型的文件，比如音频等，这些文件底层都是以二进制
	 * 形式存储，如果每次读取都返回byte，有可能在读到中间的时候遇到11111111是byte类型的-1，
	 * 而程序遇到-1就停止，后面的数据就读不到了。如果用int类型就会在前面补上24个0变成255可以保证数据读完
	 * 而且结束标记的-1就是int类型
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//demo1();
		FileInputStream f = new FileInputStream("xxx.txt");
	
		int b;
		while((b = f.read()) != -1) {
			System.out.println(b);
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream files = new FileInputStream("xx.txt");
	
		int x = files.read();//从硬盘上读取一个字节
		System.out.println(x);
		files.close();
	}

}
