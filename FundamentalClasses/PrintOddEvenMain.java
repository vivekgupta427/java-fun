package multithreading;

class PrintOddEven implements Runnable{
	
	private int value;	
	private int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
	
	public PrintOddEven(){
		value=9;
	}
			
	public void run(){
		try{
			while(value>=0){
				if(value%2==0){
					System.out.println(Thread.currentThread().getName()+" : "+ arr[value--]);
					Thread.sleep(250);
				}else{
					System.out.println(Thread.currentThread().getName()+" : "+arr[value--]);
					Thread.sleep(200);
				}
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}	
		System.out.println("Exit from thread: "+ Thread.currentThread().getName());		
	}
}

public class PrintOddEvenMain {

	public static void main(String[] args) {
		PrintOddEven t1 = new PrintOddEven();
		Thread th1 = new Thread(t1, "Thread t1");
		Thread th2 = new Thread(t1, "Thread t2");
		th1.start();
		th2.start();
		//System.out.println("Exiting from Main Thread: "+ Thread.currentThread().getName());
	}
}