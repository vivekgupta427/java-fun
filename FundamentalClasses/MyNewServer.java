package javaNetworking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNewServer {

	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String str ="";
			String str1 = "";
			while(!str.equals("stop")){
				str = dis.readUTF();
				System.out.println("Server : " + str);
				str1 = bf.readLine();
				dout.writeUTF(str1);
				dout.flush();
				}
			dout.close();
			dis.close();
			s.close();
			ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
