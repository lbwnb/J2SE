package Math;

import java.util.Scanner;

public class LotteryTest {
public static void main(String[] args) {
	Lottery l =new Lottery();
	Scanner scan = new Scanner(System.in); //创建扫描器
	System.out.println("输入需要生成号码的个数");
	
	String groupNum = scan.nextLine();
	l.generateLottery(groupNum);
}
}
