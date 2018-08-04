package javaNetworking;
import java.io.DataInputStream;
import java.net.*;

public class MyServer {
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = dis.readUTF();
			System.out.println("Message is "+ str);
			ss.close();
		}catch(Exception e ){
			e.printStackTrace();
		}
		
		
	}

}
