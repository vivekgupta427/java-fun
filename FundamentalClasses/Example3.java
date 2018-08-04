package multithreading;

public class Example3 extends Thread{
	
	public void run(){
		System.out.println("Work");
	}
	public static void main(String[] args){
		Example3 worker = new Example3();
		worker.start();
		worker.run();
		worker.start();
	}
}
