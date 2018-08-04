package javaNetworking;

import java.net.URL;

public class URLExample {

	public static void main(String[] args) {
		try{
			URL url = new URL("http://www.javatpoint.com/java-tutorial");	
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
