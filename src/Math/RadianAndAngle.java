package Math;

import java.util.Scanner;

public class RadianAndAngle {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("����Ҫת���Ļ��ȣ�");
	String Radian = scan.nextLine();
	
	while(Radian.isEmpty()) {
		System.out.println("����Ҫת���ĽǶȣ�");
		double Angle = scan.nextDouble();
		System.out.println("ת���ɻ���Ϊ:" + Math.toRadians(Angle));
	}
	System.out.println("ת���ɽǶ�Ϊ:" + Math.toDegrees(Double.parseDouble(Radian)));
}
}
