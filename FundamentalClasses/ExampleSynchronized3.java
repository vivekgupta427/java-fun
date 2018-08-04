package multithreading;

public class ExampleSynchronized3 {
	static Thread makeThread(final String id,boolean deamon){
		Thread t = new Thread(id){
			public void run(){
				System.out.println(id);
			}
		};
		t.setDaemon(deamon);
		t.start();
		return t;
	}
	
	public static void main(String[] args){
		Thread a = makeThread("A",false);
		Thread b = makeThread("B",true);
		System.out.println("End");
	}
}
