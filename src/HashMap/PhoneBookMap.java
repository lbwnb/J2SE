package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMap {
public static void main(String[] args) {
	HashMap<String,String> phonebook = new HashMap<String,String>();
	//创建一个HashMap对象，名称为phonebook，键值对的类型均为String
	
	Scanner scan = new Scanner(System.in);
	
	String keyword = new String();
	//创建一个名为keyword的字符串用于存放用户输入的关键词
	
	phonebook = initPhoneBook(phonebook);
	//利用自写的initPhoneBook方法为电话簿装入数据，完成其初始化的步骤
	
	System.out.println("输入查询的名字");
	
	keyword = scan.nextLine();
	
	while(keyword.isEmpty()) {
		System.out.println("请输入姓名");
		keyword = scan.nextLine();
	}
	
	//若用户输入某个关键词，则按照该关键词在phonebook中查找其对应的号码
	System.out.println("查询结果为：" + queryPhone(phonebook,keyword));
	scan.close();
}

private static HashMap<String, String> initPhoneBook(HashMap<String, String> phonebook) {
	// TODO Auto-generated method stub
	// 完成HashMap的初始化
	
	phonebook.put("邓入山", "13725480329");
	phonebook.put("李哈哈", "12332798200");
	phonebook.put("丘ZZ",   "13725480982");
	//使用put()方法将姓名与电话号码相关联,存放在名为phonebook的HashMap中
	//put()方法中，第一个参数为关键词key，第二个参数为其对应的值value
	
	return phonebook;
	// 返回修改后的phonebook
}
private static String queryPhone(HashMap<String, String> phonebook, String keyword) {
	// TODO Auto-generated method stub
	String result = new String();
	//创建存放结果的字符串result
	
	result = phonebook.get(keyword);
	//使用get()方法查询keyword所对应的电话号码，并赋给result
	// put()方法中，返回值为其对应的值value，未找到对应值时，返回值为null
	if(result == null)
		return"没找到该号码";
	
	return result;
	//返回查询结果
}
}
