package thread;

public class Notify {
/*
 * 等待唤醒机制
 */
	public static void main(String[] args) {
		final Printer p = new Printer();
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
class Printer {
	private int flag = 1;
	public void print1() throws InterruptedException {
		synchronized (this) {
			if(flag != 1) {
				this.wait();
			}
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("\r\n");
			flag = 2;
			this.notify();
		}
	}
	
	public void print2() throws InterruptedException {
		synchronized (this) {
			if(flag != 2) {
				this.wait();				
			}
			System.out.println("a");
			System.out.println("b");
			System.out.println("c");
			System.out.println("d");
			System.out.println("\r\n");
			flag = 1;
			this.notify();
		}
	}
}