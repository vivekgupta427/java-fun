package multithreading;

public class DeadLockDanger {
	String o1 = "lock";
	String o2 = "step";
	
	Thread t1 = (new Thread(){
		public void run(){
			while(true){
				synchronized(o1){
					synchronized(o2){
						System.out.println("Thread t1 is running :"+o1+o2);
					}
				}
			}
		}
	});
	
	Thread t2 = (new Thread(){
		public void run(){
			while(true){
				synchronized(o2){
					synchronized(o1){
						System.out.println("Thread t2 is running :"+o2+o1);
					}
				}
			}
		}
	});
	public static void main(String [] args) throws InterruptedException{
		DeadLockDanger dld = new DeadLockDanger();
		dld.t1.start();
		dld.t2.start();
		System.out.println("Exiting from main() method");
	}
}
