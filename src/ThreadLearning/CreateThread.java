package ThreadLearning;

public class CreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 thread1 = new Thread1();
//����һ��Thread1�������Thread1��̳���Thread���
Thread thread2 = new Thread(new Thread2());
//�����ڲ���

thread1.start();
thread2.start();
//�����߳�
	}

}
class Thread1 extends Thread{
	public void run() {
		//��run()�����з����߳�Ҫ��ɵĹ���
		
		for(int i= 0;i<100;i++) {
			System.out.println("��! ����" + i);
		}
		//�����ѭ���������߳��Զ�����
	}
}
class Thread2 implements Runnable{
	//��Thread1��ͬ�������һ���߳��Ѿ��̳�����һ����ʱ������ͨ��Runnable�ӿ�������
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("лл������" + i);
		}
	}
}
