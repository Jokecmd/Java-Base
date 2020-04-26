package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class luru_wenjian {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		
	}
	
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入路径：");
		while(true) {
		String line = sc.nextLine();
		File file = new File(line);
		if(!file.exists()) {
			System.out.println("不存在");
		}else if(file.isDirectory()){
			System.out.println("是文件夹，不符合");
		}else {
			return file;
		}
		}
	}

}
