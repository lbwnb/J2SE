package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMap {
public static void main(String[] args) {
	HashMap<String,String> phonebook = new HashMap<String,String>();
	//����һ��HashMap��������Ϊphonebook����ֵ�Ե����;�ΪString
	
	Scanner scan = new Scanner(System.in);
	
	String keyword = new String();
	//����һ����Ϊkeyword���ַ������ڴ���û�����Ĺؼ���
	
	phonebook = initPhoneBook(phonebook);
	//������д��initPhoneBook����Ϊ�绰��װ�����ݣ�������ʼ���Ĳ���
	
	System.out.println("�����ѯ������");
	
	keyword = scan.nextLine();
	
	while(keyword.isEmpty()) {
		System.out.println("����������");
		keyword = scan.nextLine();
	}
	
	//���û�����ĳ���ؼ��ʣ����ոùؼ�����phonebook�в������Ӧ�ĺ���
	System.out.println("��ѯ���Ϊ��" + queryPhone(phonebook,keyword));
	scan.close();
}

private static HashMap<String, String> initPhoneBook(HashMap<String, String> phonebook) {
	// TODO Auto-generated method stub
	// ���HashMap�ĳ�ʼ��
	
	phonebook.put("����ɽ", "13725480329");
	phonebook.put("�����", "12332798200");
	phonebook.put("��ZZ",   "13725480982");
	//ʹ��put()������������绰���������,�������Ϊphonebook��HashMap��
	//put()�����У���һ������Ϊ�ؼ���key���ڶ�������Ϊ���Ӧ��ֵvalue
	
	return phonebook;
	// �����޸ĺ��phonebook
}
private static String queryPhone(HashMap<String, String> phonebook, String keyword) {
	// TODO Auto-generated method stub
	String result = new String();
	//������Ž�����ַ���result
	
	result = phonebook.get(keyword);
	//ʹ��get()������ѯkeyword����Ӧ�ĵ绰���룬������result
	// put()�����У�����ֵΪ���Ӧ��ֵvalue��δ�ҵ���Ӧֵʱ������ֵΪnull
	if(result == null)
		return"û�ҵ��ú���";
	
	return result;
	//���ز�ѯ���
}
}
