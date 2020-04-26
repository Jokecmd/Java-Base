package thread;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Timer t = new Timer();
		t.schedule(new MyTimerTask(), new Date(),3000);//1.安排的任务 2.执行时间 3.过多久再重复执行
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}

class MyTimerTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("起床");
		
	}
	
}
