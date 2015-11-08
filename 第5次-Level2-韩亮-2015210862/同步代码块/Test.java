class Test
{
	public static void main(String args[]){
		MyThread mt = new MyThread();
		//生成两个Thread对象，但是这两个Thread对象是公用的一个线程体；
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		//每个线程都有名字，可以通过Thread中的setName()的方法来设计线程的名字，也可以通过Thread中的getName()来获取线程的名字；
		t1.setName("线程a");
		t2.setName("线程b");

		//分别启动两个线程；
		t1.start();
		t2.start();
	}
}