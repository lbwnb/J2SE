package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
public static void main(String[] args) {
	/**
	try {
		FileInputStream file = new FileInputStream("C:/Users/qiux/Desktop/MyFile.txt");
		//����һ���ļ�������file��ָ���ļ���·��
		
		int data = 0;
		//����һ�����ͱ������ڴ�Ŷ�ȡ������
		
		while((data = file.read()) != -1) {
			//��whileѭ����ʹ��read()����������ȡfile�����ݸ���data��
			//�����ȡʧ�ܷ���-1.������Ϊ��ȡ�����ı�ʶ
			
			System.out.println(data);
			//�����ȡ��������
		}
		file.close();
		//�ر�������
	} catch (FileNotFoundException e) {
		// δ�ҵ��ļ������쳣
		e.printStackTrace();
	}catch (IOException e) {
		//��������������󣬲����쳣
		e.printStackTrace();
	}
	*/
	/**
	try {
		BufferedInputStream file =new BufferedInputStream(new FileInputStream("C:/Users/qiux/Desktop/MyFile.txt"));
		 
		int data = 0;
		
		while((data=file.read())!=-1) {
			System.out.println(data);
		}
		file.close();
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	*/
	/**
	try {
	FileReader file = new FileReader("C:/Users/qiux/Desktop/MyFile.txt");
	int data = 0;
	
	while((data=file.read())!=-1) {
		System.out.println((char)data);
	}
	file.close();
	}catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	*/
	try {
		BufferedReader file =new BufferedReader(new FileReader("C:/Users/qiux/Desktop/MyFile.txt"));
		 
		String data = null;
		
		while((data=file.readLine())!=null) {
			
			System.out.println(data);
		}
		file.close();
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
