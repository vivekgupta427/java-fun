package multithreading;

class StackImple{
	private Object[] stackArray;
	private int topOfStack;
	
	public StackImple(int capacity){
		stackArray = new Object[capacity];
		topOfStack = -1;
	}
	
	public boolean isEmpty(){
		return topOfStack<0;
	}
	
	public boolean isFull(){
		return topOfStack >=stackArray.length-1;
	}
	
	public synchronized void push(Object element){
		System.out.println(Thread.currentThread()+" Pushing");
		while(isFull())
			try{
				System.out.println(Thread.currentThread()+" waiting to push");
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		
		stackArray[++topOfStack] = element;
		System.out.println(Thread.currentThread()+" notifying after push");
		notify();
	}
	
	public synchronized Object pop(){
		System.out.println(Thread.currentThread()+" popping");
		//Thread.currentThread().setPriority(9);
		while(isEmpty())
			try{
				System.out.println("Waiting for pop");
				wait();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
	
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack] = null;
		topOfStack--;
		
		System.out.println(Thread.currentThread()+" Notifying after pop");
		notify();
		return obj;
	}
}

abstract class StackUser implements Runnable{
	
	protected StackImple stack;
	public StackUser(String threadName, StackImple stack){
		this.stack = stack;
		Thread worker = new Thread(this,threadName);
		System.out.println(this);
		worker.setDaemon(true);
		worker.start();
	}
}

class StackPusher extends StackUser{
	
	public StackPusher(String threadName, StackImple stack){
		super(threadName, stack);
	}

	public void run() {
		while(true){
			stack.push(1000);
		}		
	}
}

class StackPopper extends StackUser{
	
	public StackPopper(String threadName,StackImple stack){
		super(threadName,stack);		
	}

	public void run() {
		while(true){
			stack.pop();
		}		
	}
}

public class WaitAndNotifyClient {
	public static void main(String [] args) throws InterruptedException{
		StackImple stack = new StackImple(5);
		new StackPusher("A", stack);	
		new StackPusher("B",stack);
		new StackPopper("C",stack);
		System.out.println("Main thread sleeping");
		Thread.sleep(10);
		System.out.println("Exit from Main Thread.");		
	}
}
