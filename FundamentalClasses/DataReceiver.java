package javaNetworking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataReceiver {

	public static void main(String[] args) {
		try{
			DatagramSocket ds = new DatagramSocket(3000);
			byte[] byt = new byte[4096];
			DatagramPacket dp = new DatagramPacket(byt, 4096);
			ds.receive(dp);
			String str = new String(dp.getData(),0,dp.getLength());
			System.out.println(str);
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
