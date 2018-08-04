package multithreading;

public class Example1 extends Thread {
	public Example1(String str){
		msg = str;
	}
	String msg;
	public void run(){
		System.out.println(msg);
	}
	public static void main(String[] args){
		new Example1("Hello").start();
		new Example1("World").start();
	}
}
