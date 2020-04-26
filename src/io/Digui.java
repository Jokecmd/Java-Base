package io;

public class Digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fun(5));
	}
	//不能次数过多，容易内存栈溢出
	//但不用知道循环次数
	//构造方法不能使用
	//不一定有返回值
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
	}
	

}
