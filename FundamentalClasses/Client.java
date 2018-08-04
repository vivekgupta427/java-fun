package multithreading;
class ImplementRunnable implements Runnable {
	private int currentValue;
	
	public ImplementRunnable(){
		currentValue = 0;
	}
	
	public int getValue(){
		return currentValue;
	}
	
	public void run(){
		try{
			while(currentValue<5){
				System.out.println(Thread.currentThread().getName() + ":"+ currentValue++);
				Thread.sleep(250);
			}
		}catch(InterruptedException ie){
			System.out.println(Thread.currentThread().getName() + " Interrupted");
		}
		System.out.println("Exit from Thread "+ Thread.currentThread().getName());
	}
}

public class Client{
	public static void main(String [] args){
		ImplementRunnable impRun = new ImplementRunnable();
		Thread th1 = new Thread(impRun);
		System.out.println(th1);
		th1.start();
		
		try{
			int val;
			do{
				val = impRun.getValue();
				System.out.println("Counter value read by "+Thread.currentThread().getName() + " :" + val);
				Thread.sleep(1000);
			}while(val<5);
		}catch(InterruptedException ie){
			System.out.println("The main thread is interrupted");
		}
		
		System.out.println("Exit from Main() thread");
		
	}
}
