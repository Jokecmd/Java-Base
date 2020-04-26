package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MoreThread {

	public static void main(String[] args) {
		
		new Receive().start();
		new Send().start();
	}

}

class Receive extends Thread{
	public void run() {
		try {
		DatagramSocket socket = new DatagramSocket(666);//码头
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//集装箱
		while(true) {
			socket.receive(packet);//接货
			
			byte[] arr = packet.getData();
			int len = packet.getLength();
			String ip = packet.getAddress().getHostAddress();
			int port = packet.getPort();
			System.out.println(ip + ":" + port + new String(arr,0,len));
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

class Send extends Thread {
	public void run() {
		try {
		Scanner sc = new Scanner(System.in);		
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			DatagramPacket packet = 
					new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("127.0.0.0"),666);
		
			socket.send(packet);
			socket.close();
		}} catch (IOException e) {
			e.printStackTrace();
		}
	}
}