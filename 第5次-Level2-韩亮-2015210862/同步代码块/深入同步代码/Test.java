class Test
{
	public static void main(String args[]){
		Service service = new Service();
		Thread thread1 = new Thread(new MyThread1(service));
		Thread thread2 = new Thread(new MyThread2(service));

		thread1.start();
		thread2.start();//��Ϊfun1()��fun2()��ͬ��������ͬ�ģ�������thread1.start()ִ��fun1()ʱ��thread2.start()��Ҫִ��fun2()ʱ���еģ���Ҫ�ȴ�thread1.start()ִ�����ſ��Կ�ʼִ�У�
	}
}