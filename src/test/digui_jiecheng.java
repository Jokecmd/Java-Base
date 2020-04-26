package test;

import java.math.BigInteger;

public class digui_jiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();//一共几个0
		demo2();//尾部几个0
		
	}

	public static void demo2() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1;i<=1000;i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi2.multiply(bi1);
		}
		String str = bi1.toString();
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void demo1() {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1;i<=1000;i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi2.multiply(bi1);
		}
		String str = bi1.toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);//一共几个0
	}

}
