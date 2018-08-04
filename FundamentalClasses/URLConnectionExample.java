package javaNetworking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {

	public static void main(String[] args) {
		try{
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			URLConnection urlconn = url.openConnection();
			InputStream inst = urlconn.getInputStream();
			int i;
			while((i=inst.read())!=-1){
				System.out.print((char)i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
