package multithreading;
class StackImpl{
	
	private Object[] stackArray;
	private int topOfStack;
	
	public int getValue(){
		return topOfStack;
	}
	
	public Object[] getStackArray(){
		return stackArray;
	}
	
	public StackImpl(int capacity){
		stackArray = new Object[capacity];
		topOfStack = -1;
	}
	
	public boolean isEmpty(){
		return topOfStack < 0;
	}
	
	public boolean isFull(){
		return topOfStack >= stackArray.length-1;
	}
	
	public synchronized boolean push(Object element){
		if(isFull()){
			return false;
		}
		++topOfStack;
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println(Thread.currentThread().getName()+" "+ "Interrupted");
		}
		stackArray[topOfStack] = element;
		return true;
	}
	
	public synchronized Object pop(){
		if(isEmpty()){
			return null;
		}
		Object item = stackArray[topOfStack];
		stackArray[topOfStack] =  null;
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println(Thread.currentThread().getName()+" "+ "Interrupted");
		}
		topOfStack--;
		return item;
	}
}
public class StackImplementation {
	public static void main(String [] args){
		final StackImpl stack = new StackImpl(15);
		
		(new Thread("Pusher"){
			public void run(){
				for(;;){
					System.out.println("Element pushed"+ " "+ stack.push(144));
				}
				
			}
		}).start();
		
		(new Thread("Popper"){
			public void run(){
				for(;;){
					System.out.println("Item popped"+ " "+ stack.pop());
				}
			
			}
		}).start();
		
		System.out.println("Exiting from Main()");
	}
}
