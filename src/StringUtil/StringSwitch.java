package StringUtil;

import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {
		String a = new String();
		String b = new String();

		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫת�����ַ�����");
		a=scan.nextLine();
		
		System.out.println("ת����СдΪ��"+a.toLowerCase());
		System.out.println("ת���ɴ�дΪ��"+a.toUpperCase());
	}
}
