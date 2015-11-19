package Fifth_works_Level4;

public class Fork {
	/* 5ֻ���ӣ���ʼΪ��δ���� */
	private boolean[] used = { false, false, false, false, false, false };

	/* ֻ�е������ֵĿ��Ӷ�δ��ʹ��ʱ���������ȡ���ӣ��ұ���ͬʱ��ȡ�����ֿ��� */
	public synchronized void takeFork() {
		String name = Thread.currentThread().getName();
		int i = Integer.parseInt(name);
		while (used[i] || used[(i + 1) % 5]) {
			try {
				wait();// �����������һֻ����ʹ�ã��ȴ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		used[i] = true;
		used[(i + 1) % 5] = true;
	}

	/* ����ͬʱ�ͷ������ֵĿ��� */
	public synchronized void putFork() {
		String name = Thread.currentThread().getName();
		int i = Integer.parseInt(name);

		used[i] = false;
		used[(i + 1) % 5] = false;
		notifyAll();// ���������߳�
	}

}
