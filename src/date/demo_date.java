package date;

import java.util.Calendar;
import java.util.Scanner;

public class demo_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入");
		Scanner scanner = new Scanner(System.in);
		String lineString = scanner.nextLine();
		int year = Integer.parseInt(lineString);
		boolean b = getYear(year);
		System.out.println(b);
	}
	
	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		return c.get(Calendar.DAY_OF_MONTH) == 29;
		
	}

}
