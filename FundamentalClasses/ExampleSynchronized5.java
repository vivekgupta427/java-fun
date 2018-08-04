package multithreading;

public class ExampleSynchronized5 extends Thread {
	
		public void run(){
			synchronized(ExampleSynchronized5.class){
			while(true){
				
				try{
					System.out.print(":");
					
					sleep(100);
					System.out.print("-");
					sleep(100);
					System.out.println(")");
					sleep(100);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
			}
		}
	
		
		public static void main(String[] args){
			new ExampleSynchronized5().start();
			new ExampleSynchronized5().start();
		}

}
