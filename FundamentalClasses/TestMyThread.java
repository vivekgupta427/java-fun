class MyThread extends Thread{
	public MyThread(){
		super("base Thread");
		System.out.println("Child thread  : " + this);
		start();
	}
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(200);
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("exiting child thread");
	}
}
class TestMyThread {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		try{
			for(int j=5;j>0;j--){
				System.out.println(Thread.currentThread().getName()+" "+j);
				Thread.sleep(400);
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Exiting main thread");
	}

}
