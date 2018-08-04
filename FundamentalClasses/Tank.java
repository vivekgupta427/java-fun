package multithreading;

public class Tank {
	private boolean isEmpty = true;
	
	public synchronized void emptying(){
		pause(true);
		isEmpty = !isEmpty;
		System.out.println("Emptying");
		notify();
	}
	
	public synchronized void filling(){
		pause(false);
		isEmpty = !isEmpty;
		System.out.println("Filling");
		notify();
	}
	
	public void pause(boolean flag){
		while(flag ? isEmpty : !isEmpty){
			try{
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}	
	}
	
	public static void main(String[] args){
		
		final Tank obj = new Tank();
		(new Thread("A"){
			public void run(){
				for(;;){
					obj.emptying();
				}
			}
		}).start();
		
		(new Thread("B"){
			public void run(){
				for(;;){
					obj.filling();;
				}
			}
		}).start();
	}
}
