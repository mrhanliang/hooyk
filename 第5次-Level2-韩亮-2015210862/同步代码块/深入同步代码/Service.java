class Service
{
	public synchronized void fun1(){
		//synchronized(this){//Ч��һ��
			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			System.out.println("fun1");
		//}
	}

	public synchronized void fun2(){
		//synchronized(this){
			System.out.println("fun2");
		//}
	}
}