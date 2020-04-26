package thread;

public class ticket_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myTicket mt = new myTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}


class myTicket implements Runnable{
	private int ticket = 100;

	@Override
	public void run() {
		while(true) {
			synchronized (Ticket.class) {
				if(ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "这是第" + ticket-- + "张");
			}
		}
	}		
}