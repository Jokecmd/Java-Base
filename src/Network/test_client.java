package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class test_client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1",123);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		ps.println(sc.nextLine());
		System.out.println(br.readLine());
		
		socket.close();
	}

}
