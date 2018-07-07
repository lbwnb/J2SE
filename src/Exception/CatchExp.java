package Exception;

public class CatchExp {
public static void main(String[] args) {
	try {
		System.out.println("我是try语句块");
		
		Class<?> tempClass = Class.forName("");
		//声明一个空的Class对象用于引发"类未发现异常"
		
		System.out.println("离开try语句块");
		
		
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("我是catch语句块");
		
		e.printStackTrace();
		//打印异常信息在程序出错的位置及原因
		
		System.out.println("离开catch语句块");
	}finally {
		
		System.out.println("我是finally语句块");
	}
}
}
