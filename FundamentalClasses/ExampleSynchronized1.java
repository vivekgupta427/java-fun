package multithreading;

class Table{
	public synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.out.println("This is Interrupted");
			}
		}
	}
}

class Thread1 extends Thread{
	Table t;
	
	public Thread1(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}

class Thread2 extends Thread{
	Table t;
	
	public Thread2(Table t){
		this.t = t;		
	}
	
	public void run(){
		t.printTable(100);
	}
}

public class ExampleSynchronized1 {
	public static void main(String [] args){
		Table t1 = new Table();
		Thread1 th1 = new Thread1(t1);
		Thread2 th2 = new Thread2(t1);
		th1.start();
		th2.start();
	}
}
