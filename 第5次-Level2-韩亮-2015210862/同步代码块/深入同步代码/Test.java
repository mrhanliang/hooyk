class Test
{
	public static void main(String args[]){
		Service service = new Service();
		Thread thread1 = new Thread(new MyThread1(service));
		Thread thread2 = new Thread(new MyThread2(service));

		thread1.start();
		thread2.start();//因为fun1()和fun2()的同步锁是相同的，所以在thread1.start()执行fun1()时，thread2.start()想要执行fun2()时不行的，需要等待thread1.start()执行完后才可以开始执行；
	}
}