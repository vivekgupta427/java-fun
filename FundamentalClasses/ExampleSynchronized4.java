package multithreading;

public class ExampleSynchronized4 extends Thread {
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	static volatile int i1,i2,j1,j2,k1,k2;
	public void run(){
		while(true){
			doIt();
			check();
		}
	}
	
	void doIt(){
		synchronized(lock1){
			i1++;
		}
		j1++;
		synchronized(lock2){
			k1++;
			k2++;
		}
		j2++;
		synchronized(lock1){
			i2++;
		}
	}
	
	void check(){
		if(i1!=i2){
			System.out.println("i" +i1+" "+i2);
		}
		if(j1!=j2){
			System.out.println("j"+j1+" "+j2);
		}
		if(k1!=k2){
			System.out.println("Hello This is k and it is printed");
		}
	}
	
	public static void main(String[] args){
		new ExampleSynchronized4().start();
		new ExampleSynchronized4().start();
	}
}
