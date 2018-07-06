package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
 public List<String> getHeadNumber(){
	 List<String> list = new ArrayList<String>();
	 //������Ʊ��ǰ��κ��뼯��
	 String lotteryNumber = "";
	 for(int i=0;i<36;i++) {
		 //��ʼ����Ʊ��ǰ��κ��뼯��
		 
		 if(i<10) {
			 list.add("0" + i +"   ");
			 //�ڼ������0~9�ĺ��룬��λ��ǰ��һ����0��
		 }else {
			 list.add("" + i +"   ");
			 //�򼯺���Ӵ���9�ĺ���
		 }
	 }
	 int roundIndex = 0;
	 //��������ʼ�������
	 
	 List<String> lotteryList = new ArrayList<String>();
	 //����ǰ�κ����List����
	 
	 for(int j=0;j<5;j++) {
		 int amount = list.size();  //��ȡǰ��κ���ĸ���
		 Random r = new Random();   //������ʵ����Random�Ķ���
		 roundIndex = r.nextInt(amount);  //��ȡһ��0��anount-1�������
		 lotteryNumber = list.get(roundIndex); //��ȡ��Ʊ���֣���ҡ�ŵĺ���
		 lotteryList.add(lotteryNumber); //����Ʊ������ӵ�lotteryList��
		 list.remove(roundIndex); //�Ƴ��ող����ĺ���
	 }
	 Collections.sort(lotteryList);
	 //��ǰ��κ����������
	return lotteryList;
	//����ǰ��κ���	 
 }
 public List<String> getRearNumber(){
	 List<String> list = new ArrayList<String>();
	 //������Ʊ�ĺ��κ��뼯��
	 String lotteryNumber = "";
	 for(int i=0;i<13;i++) {
		 //��ʼ����Ʊ�ĺ��κ��뼯��
		 
		 if(i<10) {
			 list.add("0" + i +"   ");
			 //�ڼ������0~9�ĺ��룬��λ��ǰ��һ����0��
		 }else {
			 list.add("" + i +"   ");
			 //�򼯺���Ӵ���9�ĺ���
		 }
	 }
	 int roundIndex = 0;
	 //��������ʼ�������
	 
	 List<String> lotteryList = new ArrayList<String>();
	 //�����κ����List����
	 
	 for(int j=0;j<2;j++) {
		 int amount = list.size();  //��ȡǰ��κ���ĸ���
		 Random r = new Random();   //������ʵ����Random�Ķ���
		 roundIndex = r.nextInt(amount);  //��ȡһ��0��anount-1�������
		 lotteryNumber = list.get(roundIndex); //��ȡ��Ʊ���֣���ҡ�ŵĺ���
		 lotteryList.add(lotteryNumber); //����Ʊ������ӵ�lotteryList��
		 list.remove(roundIndex); //�Ƴ��ող����ĺ���
	 }
	 Collections.sort(lotteryList);
	 //��ǰ��κ����������
	return lotteryList;
	//����ǰ��κ���	 
 }
public void generateLottery(String groupNum) {
	int groupNumber = 0;
	//��������ʱΪ�丳��ʼֵ
	
	groupNumber = Integer.parseInt(groupNum);
	StringBuilder sbuiler = new StringBuilder();
	//�����ַ�������������
	
	for(int i = 0; i<groupNumber;i++) {
		List<String> startList = getHeadNumber();
		//��ò�Ʊǰ��κ���ļ���
		
		List<String> endtList = getRearNumber();
		//��ò�Ʊ���κ���ļ���
		
		for(int m = 0; m < startList.size();m++) {
			sbuiler.append(startList.get(m));
			//append()Ϊ׷�ӷ�������ǰ��κ�����ӵ��ַ�����������
		}
		sbuiler.append("   ");
		
		for(int n = 0; n < endtList.size();n++) {
			sbuiler.append(endtList.get(n));
			//append()Ϊ׷�ӷ����������κ�����ӵ��ַ�����������
		}
		sbuiler.append("\n");
	}
	System.out.println(sbuiler.toString());
}
}
