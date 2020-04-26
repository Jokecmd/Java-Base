package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 //续写就在第二个参数传true
		FileOutputStream f = new FileOutputStream("yyy.txt",true);
		/*
		 * f.write(97); f.write(97); f.write(97);
		 */
		
		f.close();
	}

}
