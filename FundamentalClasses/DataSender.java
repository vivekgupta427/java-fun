package javaNetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataSender {

	public static void main(String[] args) {
		try{
			DatagramSocket ds = new DatagramSocket();
			String str = "Hi ! This is Vivek";
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
			ds.send(dp);
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
