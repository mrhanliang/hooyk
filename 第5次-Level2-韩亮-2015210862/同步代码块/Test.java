class Test
{
	public static void main(String args[]){
		MyThread mt = new MyThread();
		//��������Thread���󣬵���������Thread�����ǹ��õ�һ���߳��壻
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		//ÿ���̶߳������֣�����ͨ��Thread�е�setName()�ķ���������̵߳����֣�Ҳ����ͨ��Thread�е�getName()����ȡ�̵߳����֣�
		t1.setName("�߳�a");
		t2.setName("�߳�b");

		//�ֱ����������̣߳�
		t1.start();
		t2.start();
	}
}