package Fifth_works_Level2.Firstway_Thread;

public class FirstThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("FirstThread-->" + i);
			if (i == 50) {
				try {
					Thread.sleep(2000);// һ���߳���ִ���������������ô��ǰ�߳���ͻ��������״̬��
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
