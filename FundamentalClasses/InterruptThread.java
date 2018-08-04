package multithreading;

public class InterruptThread extends Thread{
	
	public void run(){
		
		System.out.println("Thread is running");
	}
	public static void main(String [] args){
		InterruptThread t1 = new InterruptThread();
		t1.start();
		
			t1.interrupt();
		
	}
}
