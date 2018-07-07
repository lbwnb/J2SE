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
		//声明一个文件输入流file，指明文件的路径
		
		int data = 0;
		//声明一个整型变量用于存放读取的数据
		
		while((data = file.read()) != -1) {
			//在while循环中使用read()方法持续读取file，数据赋到data中
			//如果读取失败返回-1.可以作为读取结束的标识
			
			System.out.println(data);
			//输出读取到的数据
		}
		file.close();
		//关闭流对象
	} catch (FileNotFoundException e) {
		// 未找到文件捕获异常
		e.printStackTrace();
	}catch (IOException e) {
		//输入输出发生错误，捕获异常
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
