package StringUtil;

import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {
		String a = new String();
		String b = new String();

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要转换的字符串：");
		a=scan.nextLine();
		
		System.out.println("转换成小写为："+a.toLowerCase());
		System.out.println("转换成大写为："+a.toUpperCase());
	}
}
