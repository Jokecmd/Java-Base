package thread;

/*
 * 1.饿汉式是空间换时间
 * 懒汉式时间换空间
 * 2.多线程访问时饿汉式不会创建多个对象，懒汉式可能
 * 
 */
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
class Singleton1{
	//私有构造方法，其他类不能访问该构造方法
	private Singleton1() {}
	//创建本类对象
	private static Singleton1 s = new Singleton1();
	//对外提供公共的访问方法
	public static Singleton1 getInstance() {
		return s;
	}
}
class Singleton2{
	private Singleton2() {}
	private static Singleton2 s;
	public static Singleton2 getINstance() {
		if(s == null) {
			s = new Singleton2();
		}
		return s;
	}
}
class Singleton3{
	private Singleton3() {}
	private static final Singleton3 s = new Singleton3();
	
}
