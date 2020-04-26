package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.*;

public class io_file {

	public static void main(String[] args) throws IOException {
		File dir = getDir();
		printJava(dir);

		


	}
	//获取路径
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入路径：");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists()) {
				System.out.println("不存在");
			}else if(dir.isFile()) {
				System.out.println("是文件路径");
			}else {
				return dir;
			}
		}
	}
	//获取路径下的所有文件
	public static void printJava(File dir) throws IOException {
		//获取该文件夹路径下所有文件和文件夹保存在file数组中
		File[] files = dir.listFiles();
		
		//遍历判断
		for (File file : files) {
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);				
				//BufferedWriter bw = new BufferedWriter(new FileWriter("java.txt"));
			}else if(file.isDirectory()){
				printJava(file);
			}
		}
	}

}
