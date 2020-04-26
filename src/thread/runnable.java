package thread;

public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myRunnable mr = new myRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("bbbbbbbbb");
		}
	}

}


class myRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaaaaa");
		}
	}
	
}
