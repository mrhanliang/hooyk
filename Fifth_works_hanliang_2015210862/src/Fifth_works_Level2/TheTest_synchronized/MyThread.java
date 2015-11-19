package Fifth_works_Level2.TheTest_synchronized;

public class MyThread implements Runnable {
	int i = 100;

	public void run() {
		while (true) {
			synchronized (this) {// 只要有一个线程执行了这段代码，那么带有同样的同步锁的所有的代码都不能被另一个想执行有这样同步锁代码的线程执行，需要等上一个线程执行完才可以；如：Flie
				// 深入同步代码 的例子；
				if (i < 0) {
					break;
				}

				// Thread.currentThread()作用是检测使用这段代码的是第几线程；他是Tread的静态函数；
				System.out.println(Thread.currentThread().getName() + i);

				i--;
				Thread.yield();
			}
		}
	}
}
