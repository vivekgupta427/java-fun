package multithreading;

class PrintOddOrEven extends Thread{
	private int value = 10;
	
	public PrintOddOrEven(String threadName){
		super(threadName);
		//value = 10;
		//System.out.println(this);	
		}
	
	public int getValue(){
		return value;
	}
	
	public void run(){
		try{
			while(value>0){
				if(value%2 == 0){
					System.out.println(getName()+ " : "+value);
				 	value =  value-1;
					Thread.sleep(250);
				}else if(value %2!=0){
					System.out.println(getName()+" : "+value);
					value = value - 1;
					Thread.sleep(250);
				}
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}

public class PrintOddEvenUsingThreadClassMain {
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		PrintOddOrEven t1 = new PrintOddOrEven("t1");
		PrintOddOrEven t2 = new PrintOddOrEven("t2");
		System.out.println("Exit from main method");
		t1.start();
		t2.start();
	}

}
