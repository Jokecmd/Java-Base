package thread;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				System.out.println(getName() + "aaaaaaa");
			}
		}.start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "bbbbbbb");
			}
		}).start();
		
		Thread.currentThread().setName("xxx");
		System.out.println(Thread.currentThread().getName());
	}

}
