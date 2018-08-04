package multithreading;

class Counter extends Thread{
	private int currentValue;
	
	public int getValue(){
		return currentValue;
	}
	public Counter(String threadName){
		super(threadName);
		currentValue = 0;
		System.out.println(this);
		
		start();
	}
	
	public void run(){
		try{
			while(currentValue<5){
				System.out.println(getName() + " "+ currentValue++);
				Thread.sleep(250);
			}
		}catch(InterruptedException ie){
			System.out.println(getName()+ " Interrupted");
		}
		System.out.println("Exiting from thread "+getName());
	}
}

public class ThreadExample2 {
	public static void main(String [] args){
		System.out.println("Main method runs in thread "+Thread.currentThread().getName());
		Counter counterA = new Counter("Counter A");
		Counter counterB = new Counter("Counter B");
		System.out.println("Exit from Main() method");
	}
}
