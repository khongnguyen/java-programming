package Week1.hw.thread;

public class MyThread implements Runnable {

	Thread thrd;
	
	MyThread(String name){
		thrd = new Thread(this, name);
		thrd.start();
	}
	@Override
	public void run() {
		System.out.println(thrd.getName() + "is started.");
		try {
			for (int count = 0; count < 5; count++) {
				Thread.sleep(400);
				System.out.println(thrd.getName() + ",is counting" + count);
			}
		}
		catch (InterruptedException e) {
			System.out.println(thrd.getName() + "is shut down");
		}
		System.out.println(thrd.getName() + "is ended.");
	}

}
