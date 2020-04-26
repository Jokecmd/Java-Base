package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test_server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(123);
		System.out.println("服务器启动，绑定123端口");
		while(true) {
			final Socket socket = server.accept();
			
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));					
						PrintStream ps = new PrintStream(socket.getOutputStream());
						String line = br.readLine();
						
						line = new StringBuilder(line).reverse().toString();
						ps.println(line);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
		}

	}

}
