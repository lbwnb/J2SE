package ThreadLearning;

public class ThreadState implements Runnable {

	public synchronized void waitForAMoment() throws InterruptedException {
		wait(500);
		// ʹ��wait()����ʹ��ǰ�̵߳ȴ�500����
		// ���ߵȴ������̵߳���notity()��notifyAll()��������
	}

	public synchronized void waitForever() throws InterruptedException {
		wait();
		// ������ʱ�����ζ��ʹ��ǰ�߳����õȴ���
		// ֻ�ܵȵ������̵߳���nitify()��notifyAll()��������
	}

	public synchronized void noyifyNow() throws InterruptedException {
		notify();
		// ʹ��notify()������������Щ��Ϊ������wait()����������ȴ�״̬���߳�
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitForAMoment();
			// �����߳�������waitMoment()����

			waitForever();
			// �����߳�������waitForever()����
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
