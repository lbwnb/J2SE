package StringUtil;

import java.util.Scanner;

public class StringTools {
public static void main(String[] args) {
	String a = new String();
	String b = new String();
	String c = new String();
	//创建3个字符串对象
	
	Scanner scan = new Scanner(System.in); //创建扫描器
	System.out.println("请输入一个字符串 : ");
	//获得用户输入的包含空格的字符串
	
	a = scan.nextLine();
	//将键盘上的输入赋到字符串a中
	
	b = a.trim();
	//将a中头部和尾部的空格去掉，赋值到b中
	
	if(b.equals("shiyanlou"))
		c = b.substring(0, 6);
	else {
		c = "";
	}
	//如果b字符串为shiyanlou，则取其第0个到第6个字符作为子串，赋值到c中
	//如果b字符串不为shiyanlou，则c的值为空
	
	System.out.println("a:"+a);
	System.out.println("a的字符串长度:"+ a.length());
	System.out.println("b:"+b);
	System.out.println("b的字符串长度:"+ b.length());
	System.out.println("c:"+c);
	System.out.println("c的字符串长度:"+ c.length());
	
	//分别输入a、b、c三个字符串及其长度
}
}
