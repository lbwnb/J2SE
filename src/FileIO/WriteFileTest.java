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
	//路径
	String content = "shiyanlou";
	//待写入内容
	FileOutputStream file = new FileOutputStream(path);
	//声明一个文件输出流对象
	
	file.write(content.getBytes());
	//通过write()方法将数据写入到文件中
	//getBytes()方法将字符串转化为二进制序列
	
	file.close();
	
	System.out.println("创建成功");
	
	
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
		System.out.println("创建成功");
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	e.printStackTrace();
	}
}
}
