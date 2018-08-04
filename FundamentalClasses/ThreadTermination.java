package multithreading;

class Worker implements Runnable{
	private volatile Thread theThread;
	
	public void kickStart(){
		if(theThread == null){
			theThread = new Thread(this);
			theThread.start();
			
		}
	}
	
	public void terminateThread(){
		theThread = null;
	}
	
	public void run(){
		if(theThread == Thread.currentThread()){
			System.out.println("Executing in loop");
		}
	}
}

public class ThreadTermination {

	public static void main(String[] args) {
		Worker work = new Worker();
		work.kickStart();
		
		try{
			Thread.sleep(10);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		work.terminateThread();
		
	}

}
