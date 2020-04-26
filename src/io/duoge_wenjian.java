package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class duoge_wenjian {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//整合多个：sequenceInputStream(Enumeration)
		FileInputStream f1 = new FileInputStream("a.txt");
		FileInputStream f2 = new FileInputStream("b.txt");
		FileInputStream f3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

}
