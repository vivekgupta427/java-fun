package multithreading;

class Table1{
	void printTable(int n){
		synchronized(this){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.out.println("This is interrupted");
			}
		}
		}
	}
}

class Thread3 extends Thread{
	Table1 t1;
	
	public Thread3(Table1 t1){
		this.t1 = t1;
	}
	
	public void run(){
		t1.printTable(5);
	}
}

class Thread4 extends Thread{
	Table1 t2;
	
	public Thread4(Table1 t2){
		this.t2= t2;
	}
	
	public void run(){
		t2.printTable(100);
	}
}
public class ExampleSynchronized2 {
	public static void main(String [] args){
		Table1 tab = new Table1();
		Thread3 th1 = new Thread3(tab);
		Thread4 th2 = new Thread4(tab);
		th1.start();
		th2.start();
	}
}
