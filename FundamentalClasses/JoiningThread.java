package multithreading;

class Counter1 extends Thread{
	private int currentValue;
	
	public Counter1(String threadName){
		super(threadName);
		currentValue = 0;
		System.out.println(this);
		start();
	}
	
	public int getValue(){
		return currentValue;
	}
	
	public void run(){
		try{
			while(currentValue<5){
				System.out.println(getName()+":"+currentValue++);
				sleep(250);
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(getName()+" "+"Exit from Thread");
	}
}

public class JoiningThread {
	public static void main(String [] args){
		Counter1 counterA = new Counter1("CounterA");
		Counter1 counterB = new Counter1("CounterB");
		try{
			System.out.println("Waiting for child threads to finish");
			//counterA.join();
			if(!counterA.isAlive()){
				System.out.println("CounterA thread is not Alive");
			}
			counterB.join();
			if(!counterB.isAlive()){
				System.out.println("CounterB thread is not Alive");
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}	
		System.out.println("Exiting from Main Thread");
	}
}
