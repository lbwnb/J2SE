package Math;

import java.util.Scanner;

public class LotteryTest {
public static void main(String[] args) {
	Lottery l =new Lottery();
	Scanner scan = new Scanner(System.in); //����ɨ����
	System.out.println("������Ҫ���ɺ���ĸ���");
	
	String groupNum = scan.nextLine();
	l.generateLottery(groupNum);
}
}
