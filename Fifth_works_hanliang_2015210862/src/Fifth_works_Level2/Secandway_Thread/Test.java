package Fifth_works_Level2.Secandway_Thread;

public class Test {
	public static void main(String args[]){
		//����һ��Runnable�ӿ�ʵ����Ķ���
		RunnableImple ri = new RunnableImple();
		//���� һ��Thread���󣬲���Runnable�ӿ�ʵ�ֵĶ�����Ϊ�������ݸ���Thread����
		Thread t = new Thread(ri);

		t.setPriority(Thread.MAX_PRIORITY);
		//������ͨ��t.setPriority(Thread.MIN_PRIORITY)�����ı��߳����ȼ��������10����С��1����ֻ��˵���ȼ�Խ����ִ�еĸ��ʾ�Խ�󣬲���˵���ȼ�Խ�󣬾�һ����ִ�У�

		System.out.println(t.getPriority());

		//֪ͨThread����ִ��start������
		t.start();

		for(int i = 0 ; i < 100 ; i++){
			System.out.println("main-->" + i);
		}
	}
}
