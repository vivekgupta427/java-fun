package multithreading;

public class Example4 extends Thread {
	
	public Example4(String str){
		super(str);
	}
	
	public void run() throws IllegalThreadStateException{
		System.out.println(getName());
		throw new IllegalThreadStateException();
	}
	public static void main(String [] args){
		new Example4("T1").start();
	}
	
}
