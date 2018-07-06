package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
 public List<String> getHeadNumber(){
	 List<String> list = new ArrayList<String>();
	 //创建彩票的前半段号码集合
	 String lotteryNumber = "";
	 for(int i=0;i<36;i++) {
		 //初始化彩票的前半段号码集合
		 
		 if(i<10) {
			 list.add("0" + i +"   ");
			 //在集合添加0~9的号码，个位数前加一个“0”
		 }else {
			 list.add("" + i +"   ");
			 //向集合添加大于9的号码
		 }
	 }
	 int roundIndex = 0;
	 //创建并初始化随机数
	 
	 List<String> lotteryList = new ArrayList<String>();
	 //保存前段号码的List集合
	 
	 for(int j=0;j<5;j++) {
		 int amount = list.size();  //获取前半段号码的个数
		 Random r = new Random();   //创建并实例化Random的对象
		 roundIndex = r.nextInt(amount);  //获取一个0到anount-1的随机数
		 lotteryNumber = list.get(roundIndex); //获取彩票数字，即摇号的号码
		 lotteryList.add(lotteryNumber); //将彩票号码添加到lotteryList中
		 list.remove(roundIndex); //移除刚刚产生的号码
	 }
	 Collections.sort(lotteryList);
	 //对前半段号码进行排序
	return lotteryList;
	//返回前半段号码	 
 }
 public List<String> getRearNumber(){
	 List<String> list = new ArrayList<String>();
	 //创建彩票的后半段号码集合
	 String lotteryNumber = "";
	 for(int i=0;i<13;i++) {
		 //初始化彩票的后半段号码集合
		 
		 if(i<10) {
			 list.add("0" + i +"   ");
			 //在集合添加0~9的号码，个位数前加一个“0”
		 }else {
			 list.add("" + i +"   ");
			 //向集合添加大于9的号码
		 }
	 }
	 int roundIndex = 0;
	 //创建并初始化随机数
	 
	 List<String> lotteryList = new ArrayList<String>();
	 //保存后段号码的List集合
	 
	 for(int j=0;j<2;j++) {
		 int amount = list.size();  //获取前半段号码的个数
		 Random r = new Random();   //创建并实例化Random的对象
		 roundIndex = r.nextInt(amount);  //获取一个0到anount-1的随机数
		 lotteryNumber = list.get(roundIndex); //获取彩票数字，即摇号的号码
		 lotteryList.add(lotteryNumber); //将彩票号码添加到lotteryList中
		 list.remove(roundIndex); //移除刚刚产生的号码
	 }
	 Collections.sort(lotteryList);
	 //对前半段号码进行排序
	return lotteryList;
	//返回前半段号码	 
 }
public void generateLottery(String groupNum) {
	int groupNumber = 0;
	//创建变量时为其赋初始值
	
	groupNumber = Integer.parseInt(groupNum);
	StringBuilder sbuiler = new StringBuilder();
	//创建字符串生成器对象
	
	for(int i = 0; i<groupNumber;i++) {
		List<String> startList = getHeadNumber();
		//获得彩票前半段号码的集合
		
		List<String> endtList = getRearNumber();
		//获得彩票后半段号码的集合
		
		for(int m = 0; m < startList.size();m++) {
			sbuiler.append(startList.get(m));
			//append()为追加方法，将前半段号码添加到字符串生成器中
		}
		sbuiler.append("   ");
		
		for(int n = 0; n < endtList.size();n++) {
			sbuiler.append(endtList.get(n));
			//append()为追加方法，将后半段号码添加到字符串生成器中
		}
		sbuiler.append("\n");
	}
	System.out.println(sbuiler.toString());
}
}
