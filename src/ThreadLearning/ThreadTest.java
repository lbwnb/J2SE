package ThreadLearning;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException{
		
	
		// TODO Auto-generated method stub
		ThreadState state = new ThreadState();
        //������ʵ����һ��ThreadState����

		Thread thread = new Thread(state);
		//���������Ϊstate��ThreadState����������Thread����
		
		System.out.println("�������̣߳� " + thread.getState());
		//ʹ��getState()����������̵߳�״̬�����������
		
		thread.start();
		//ʹ��thread�����start()�����������µ��߳�
		
		System.out.println("��ʼ�µ��̣߳� " + thread.getState());
		//����̵߳�״̬
		
		Thread.sleep(100);
		//ͨ������sleep()����ʹ����߳�����100���룬�Ӷ�ʹ�µ��߳�����waitForAMoment()����
		
		System.out.println("�ȴ�Ƭ�̣� " + thread.getState());
		//����̵߳�״̬
		
		Thread.sleep(1000);
		//ʹ����߳�����1000���룬�Ӷ�ʹ�µ��߳�����waitForever()����
		
		System.out.println("�ȴ�Ƭ�̣� " + thread.getState());
		//����̵߳�״̬
		
		state.noyifyNow();
		//����state��notifyNow()����
		
		System.out.println("�����̣߳� " + thread.getState());
		//����̵߳�״̬
		
		Thread.sleep(1000);
		//ʹ��ǰ�߳�����1000���룬ʹ���߳̽���
		
		System.out.println("��ֹ�̣߳� " + thread.getState());
		//����̵߳�״̬
		
	}
}
