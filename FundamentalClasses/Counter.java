
public class Counter implements Runnable {
private int currentValue;
public Counter(){
	currentValue=0;
}
public int getValue(){
	return currentValue;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		try{
			while(currentValue<5){
				System.out.println("Current thread is"+Thread.currentThread().getName()+" : "+currentValue++);
			}
			Thread.sleep(250);
		}catch(InterruptedException ie){
			System.out.println(Thread.currentThread().getName()+" : "+"Thread interrupted");
		}	
		System.out.println("Exit from Thread"+Thread.currentThread().getName());
	}
}
