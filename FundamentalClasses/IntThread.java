  public class IntThread implements Runnable{
	Thread t;
	 public IntThread() {
		 t= new Thread(this,"ChildThread");
		 System.out.println(Thread.currentThread().getName()+" "+t);
		 t.start();	
	}

	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(250);
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Exiting from child thread");
	}
	public static void main(String[] args) {
	IntThread it = new IntThread();
	try{
		for(int j=5;j>0;j--){
			System.out.println(Thread.currentThread().getName()+" "+j);
			Thread.sleep(500);
		}
	} catch(InterruptedException ie){
		ie.printStackTrace();
	}
	System.out.println("Exiting from main thread");
	}
}
