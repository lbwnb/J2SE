package StringUtil;

import java.util.Scanner;

public class StringTools {
public static void main(String[] args) {
	String a = new String();
	String b = new String();
	String c = new String();
	//����3���ַ�������
	
	Scanner scan = new Scanner(System.in); //����ɨ����
	System.out.println("������һ���ַ��� : ");
	//����û�����İ����ո���ַ���
	
	a = scan.nextLine();
	//�������ϵ����븳���ַ���a��
	
	b = a.trim();
	//��a��ͷ����β���Ŀո�ȥ������ֵ��b��
	
	if(b.equals("shiyanlou"))
		c = b.substring(0, 6);
	else {
		c = "";
	}
	//���b�ַ���Ϊshiyanlou����ȡ���0������6���ַ���Ϊ�Ӵ�����ֵ��c��
	//���b�ַ�����Ϊshiyanlou����c��ֵΪ��
	
	System.out.println("a:"+a);
	System.out.println("a���ַ�������:"+ a.length());
	System.out.println("b:"+b);
	System.out.println("b���ַ�������:"+ b.length());
	System.out.println("c:"+c);
	System.out.println("c���ַ�������:"+ c.length());
	
	//�ֱ�����a��b��c�����ַ������䳤��
}
}
