package other_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import java.io.InputStream;
import io.OutputStream;

public class picture {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		System.setIn(new FileInputStream("xxx.jpg"));
		System.setOut(new PrintStream("copy.jpg"));
		
		InputStream is = System.in;
		PrintStream ps = System.out;
		
		byte[] b = new byte[1024];
		int len;
		
		while((len = is.read(b)) != -1) {
			ps.write(b,0,len);
		}
		is.close();
		ps.close();
	}

}
