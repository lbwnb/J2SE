package ThreadLearning;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException{
		
	
		// TODO Auto-generated method stub
		ThreadState state = new ThreadState();
        //声明并实例化一个ThreadState对象

		Thread thread = new Thread(state);
		//利用这个名为state的ThreadState对象来创建Thread对象
		
		System.out.println("创建新线程： " + thread.getState());
		//使用getState()方法来获得线程的状态，并进行输出
		
		thread.start();
		//使用thread对象的start()方法来启动新的线程
		
		System.out.println("开始新的线程： " + thread.getState());
		//输出线程的状态
		
		Thread.sleep(100);
		//通过调用sleep()方法使这个线程休眠100毫秒，从而使新的线程运行waitForAMoment()方法
		
		System.out.println("等待片刻： " + thread.getState());
		//输出线程的状态
		
		Thread.sleep(1000);
		//使这个线程休眠1000毫秒，从而使新的线程运行waitForever()方法
		
		System.out.println("等待片刻： " + thread.getState());
		//输出线程的状态
		
		state.noyifyNow();
		//调用state的notifyNow()方法
		
		System.out.println("唤醒线程： " + thread.getState());
		//输出线程的状态
		
		Thread.sleep(1000);
		//使当前线程休眠1000毫秒，使新线程结束
		
		System.out.println("终止线程： " + thread.getState());
		//输出线程的状态
		
	}
}
