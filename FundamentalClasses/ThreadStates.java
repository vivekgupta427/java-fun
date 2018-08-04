package multithreading;

public class ThreadStates {
	private static Thread t1 = new Thread(){
		public void run(){
			try{
				Thread.sleep(2);
				for(int i =10000;i>0;i--);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	};
	
	public static void main(String[] args){
		t1.start();
		while(true){
			Thread.State state = t1.getState();
			System.out.println(state);
			if(state==Thread.State.TERMINATED){
				break;
			}
		}
		
	}
}
