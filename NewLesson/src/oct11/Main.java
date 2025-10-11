package oct11;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		HelloThread thread1 = new HelloThread();
        WorldThread thread2 = new WorldThread();
        
        thread1.run();
        thread2.run();

	}

}
