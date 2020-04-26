package test;

import java.io.File;
import java.util.Scanner;



public class io_wenjianjia_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dirFile = getDir();
		System.out.println(getFileLength(dirFile));
	}

	public static File getDir() {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入：");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("不存在");
			}else if(dir.isFile()){
				System.out.println("是文件路径");
			}else {
				return dir;
			}
		}
	}
	//统计文件夹大小
	public static long getFileLength(File dir) {
		long len = 0;
		File[] subFiles = dir.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isFile()) {
				len = len +subFile.length();
			}
			else {
				len = len + getFileLength(subFile);
			}
		}
		
		return len;
	}
	

}
