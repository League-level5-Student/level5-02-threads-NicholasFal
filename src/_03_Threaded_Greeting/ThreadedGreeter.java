package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int member;
	
	ThreadedGreeter(int member) {
		this.member = member;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + member);
		if(member <= 50) {
			Thread t = new Thread(new ThreadedGreeter(member+=1));
			t.start();
			try {
			t.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
