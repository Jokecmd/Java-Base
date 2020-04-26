package Network;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.border.Border;

public class GuiChat extends Frame{

	private TextField tf;
	private Button send;
	private Button record;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;

	public static void main(String[] args) {
		new GuiChat();

	}
	
	public GuiChat() {
		init();
		southPanel();
		centerPanel();
		event();
		
	}

	private void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				socket.close();
				System.exit(0);
			}
		});
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {					
					e1.printStackTrace();
				}				
			}		
		});
		
	}
	private void send() throws IOException {
		String message = sendText.getText();
		String ip = tf.getText();
		
		DatagramPacket packet = 
				new DatagramPacket(message.getBytes(), message.getBytes().length,InetAddress.getByName(ip),999);
		socket.send(packet);
		
		String time = getCurrentTime();
		viewText.append(time + "我对" + ip + "说\r\n" + message + "\r\n\r\n");
		sendText.setText("");
	}

	private String getCurrentTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 hh时mm分ss秒");
		return sdf.format(d);
	}

	private void centerPanel() {
		Panel center = new Panel();
		viewText = new TextArea();
		sendText = new TextArea(5,1);
		center.setLayout(new BorderLayout());
		center.add(sendText,BorderLayout.SOUTH);
		center.add(viewText,BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		sendText.setFont(new Font("xx",Font.PLAIN,20));
		viewText.setFont(new Font("xx",Font.PLAIN,20));
		this.add(center,BorderLayout.CENTER);
		
	}

	private void southPanel() {
		Panel south = new Panel();
		tf = new TextField(20);
		tf.setText("127.0.0.0");
		send = new Button("发 送");
		record = new Button("记 录");
		clear = new Button("清 屏");
		shake = new Button("振 动");
		south.add(tf);
		south.add(send);
		south.add(record);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);
		
	}

	public void init() {
		this.setLocation(500,50);
		this.setSize(400,600);
		new Receive().start();
		try {
			socket = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
	}
	private class Receive extends Thread {
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(999);
			
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				while(true) {
					socket.receive(packet);
					byte[] arr = packet.getData();
					int len = packet.getLength();
					String message = new String(arr,0,len);
					String time = getCurrentTime();
					String ip = packet.getAddress().getHostAddress();
					viewText.append(time + ip + "对我说\r\n" + message + "\r\n\r\n");
				}
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
