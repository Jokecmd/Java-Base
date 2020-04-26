package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src = io_wenjianjia_size.getDir();
		File dest = io_wenjianjia_size.getDir();
		if(src.equals(dest)) {
			System.out.println("错误");
		}else {
			copy(src,dest);
		}
		
	}

	public static void copy(File src, File dest) throws IOException {
		// TODO Auto-generated method stub
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		
		File[] subFiles = src.listFiles();
		for (File subFile : subFiles) {
			if(subFile.isFile()) {
				BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
				int b;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(subFile, newDir);
			}
		}
	}

}
