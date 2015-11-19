package Fifth_works_Level4;

public class Philosopher extends Thread {
	private String name;
	private Fork fork;

	public Philosopher(String name, Fork fork) {
		super(name);
		this.name = name;
		this.fork = fork;
	}

	public void run() {
		while (true) {
			thinking();
			fork.takeFork();
			eating();
			fork.putFork();
		}

	}

	public void eating() {
		System.out.println("I am Eating:" + name);
		try {
			sleep(1000);// ģ��Է���ռ��һ��ʱ����Դ
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void thinking() {
		System.out.println("I am Thinking:" + name);
		try {
			sleep(1000);// ģ��˼��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}