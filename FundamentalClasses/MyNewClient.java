package javaNetworking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyNewClient {

	public static void main(String[] args) {
		try{
			Socket s = new Socket("localhost",6666);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			String str ="";
			String str1="";
			
			while(!str.equals("stop")){
				str = bf.readLine();
				dout.writeUTF(str);
				dout.flush();
				str1 = dis.readUTF();
				System.out.println("Server says: "+str1);
				
			}
			
			dis.close();
			s.close();
		}catch(Exception e ){
			e.printStackTrace();
		}
		

	}

}
