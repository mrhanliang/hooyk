package Fifth_works_Level2.TheTest_synchronized.Deep_sync;

public class MyThread implements Runnable{
	int i = 100;
	public void run(){
			while(true){
				synchronized(this){//ֻҪ��һ���߳�ִ������δ��룬��ô����ͬ����ͬ���������еĴ��붼���ܱ���һ����ִ��������ͬ����������߳�ִ�У���Ҫ����һ���߳�ִ����ſ��ԣ��磺Flie ����ͬ������ �����ӣ�
				if(i < 0){
					break;
				}
				
				//Thread.currentThread()�����Ǽ��ʹ����δ�����ǵڼ��̣߳�����Tread�ľ�̬������
				System.out.println(Thread.currentThread().getName() + i);
				
				i--;
				Thread.yield();
			}
		}		
	}
}
