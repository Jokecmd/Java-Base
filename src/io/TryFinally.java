package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryFinally {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
		FileInputStream f1 = new FileInputStream("x.txt");
		FileOutputStream f2 = new FileOutputStream("y.txt");
){		
		int a;
		while((a = f1.read()) != -1) {
			f2.write(a);
		}

	}

}
}
