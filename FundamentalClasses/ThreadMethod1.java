
public class ThreadMethod1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread"+t);
		t.setName("My Thread");
		System.out.println("After Name changed"+t.getName());
		System.out.println("Thread priority is"+t.getPriority());
		t.setPriority(3);
		System.out.println("Thread priority after change is"+t.getPriority());
	}

}
