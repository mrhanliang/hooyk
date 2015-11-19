package Fifth_works_Level2.Secandway_Thread;

public class Test {
	public static void main(String args[]) {
		// 生成一个Runnable接口实现类的对象；
		RunnableImple ri = new RunnableImple();
		// 生成 一个Thread对象，并将Runnable接口实现的对象作为参数传递给该Thread对象；
		Thread t = new Thread(ri);

		t.setPriority(Thread.MAX_PRIORITY);
		// 或者是通过t.setPriority(Thread.MIN_PRIORITY)，来改变线程优先级（最大是10，最小是1）；只能说优先级越大，先执行的概率就越大，不能说优先级越大，就一定先执行；

		System.out.println(t.getPriority());

		// 通知Thread对象，执行start方法；
		t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main-->" + i);
		}
	}
}
