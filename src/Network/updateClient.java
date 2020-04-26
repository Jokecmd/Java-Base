package Network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class updateClient {
//上传文件
	public static void main(String[] args) throws UnknownHostException, IOException {
		File file = getFile();
		Socket socket = new Socket("127.0.0.1",123);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.print(br.readLine());
		//接受结果，若存在给予提示，程序直接退出
		String result = br.readLine();
		if("存在".equals(result)) {
			System.out.println("已存在");
			socket.close();
			return;
		}
		//不存在，定义fileinputstream读取文件写出到网络
		FileInputStream fi = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len;
		while((len = fi.read(arr)) != -1) {
			ps.write(arr,0,len);
		}
		fi.close();
		socket.close();

	}

private static File getFile() {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入文件路径");
	while(true) {
	String line = sc.nextLine();
	File file = new File(line);
	
	if (!file.exists()) {
		System.out.println("不存在");
	}else if(file.isDirectory()){
		System.out.println("是文件夹");
	}else {
		return file;
	}
	}
}

}
