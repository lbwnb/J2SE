package ThreadLearning;

public class CreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 thread1 = new Thread1();
//声明一个Thread1对象，这个Thread1类继承自Thread类的
Thread thread2 = new Thread(new Thread2());
//匿名内部类

thread1.start();
thread2.start();
//启动线程
	}

}
class Thread1 extends Thread{
	public void run() {
		//在run()方法中放入线程要完成的工作
		
		for(int i= 0;i<100;i++) {
			System.out.println("嗨! 这是" + i);
		}
		//在这个循环结束后，线程自动结束
	}
}
class Thread2 implements Runnable{
	//与Thread1不同，如果当一个线程已经继承了另一个类时，建议通过Runnable接口来构造
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("谢谢，这是" + i);
		}
	}
}
