package FileIO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {
public static void main(String[] args) {
	/**
	
try {
	String path = "C:/Users/qiux/Desktop/newfile.txt";
	//·��
	String content = "shiyanlou";
	//��д������
	FileOutputStream file = new FileOutputStream(path);
	//����һ���ļ����������
	
	file.write(content.getBytes());
	//ͨ��write()����������д�뵽�ļ���
	//getBytes()�������ַ���ת��Ϊ����������
	
	file.close();
	
	System.out.println("�����ɹ�");
	
	
} catch (FileNotFoundException e) {
	// TODO: handle exception
	e.printStackTrace();
}catch (IOException e) {
	// TODO: handle exception
e.printStackTrace();
}
*/
	try {
		BufferedWriter file =new BufferedWriter(new FileWriter("C:/Users/qiux/Desktop/newfile2.txt"));
		file.write("shiyanlou");
		file.close();
		System.out.println("�����ɹ�");
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	e.printStackTrace();
	}
}
}
