package Math;

import java.util.Scanner;

public class RadianAndAngle {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("输入要转换的弧度：");
	String Radian = scan.nextLine();
	
	while(Radian.isEmpty()) {
		System.out.println("输入要转换的角度：");
		double Angle = scan.nextDouble();
		System.out.println("转换成弧度为:" + Math.toRadians(Angle));
	}
	System.out.println("转换成角度为:" + Math.toDegrees(Double.parseDouble(Radian)));
}
}
