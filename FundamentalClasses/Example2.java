package multithreading;

class Extender extends Thread{
	public Extender(){}
	
	public Extender(Runnable runnable){
		super(runnable);
	}
	
	public void run(){
		System.out.println("Extender");
	}
}
public class Example2 implements Runnable {
	public void run(){
		System.out.println("Implementer");
	}
	
	public static void main(String [] args){
		new Extender(new Example2()).start();
		new Extender().start();
		new Thread(new Example2()).start();
	}

}
