package Fifth_works_Level2.Firstway_Thread;

public class Test {
	public static void main(String args[]){
		//生成线程类的对象；
		FirstThread ft = new FirstThread();
		//启动线程；
		ft.start();

		//ft.run();如果执行这个函数，就不是多线程了，而是主线程，会按顺序一个一个的执行；

		for(int i = 0 ; i < 100 ; i++){
			System.out.println("main-->" + i);
		}
	}
}
