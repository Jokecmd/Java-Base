package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receive_demo {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(666);//码头
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);//集装箱
		socket.receive(packet);//接货
		
		byte[] arr = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr,0,len));
		socket.close();

	}

}
