package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
/*
 * 程序启动一个新线程成本高，因为要涉及到操作系统进行交互，而线程池可以很好提高性能，尤其
 * 当程序中要创建大量生存期很短的线程时更应该考虑使用线程池，线程池里的每一个线程代码结束
 * 后并不会死亡，而是再次回到线程池中成为空闲状态等待下一个对象来使用
 */
public class Executors {

	public static void main(String[] args) {
	
	}

}
