package javaNetworking;

import java.io.DataOutputStream;
import java.net.*;
public class MyClient {
	public static void main(String[] args){
		try{
			Socket s = new Socket("Localhost",6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
