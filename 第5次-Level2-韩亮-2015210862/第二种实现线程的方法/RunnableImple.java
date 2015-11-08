class RunnableImple implements Runnable
{
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("RunnableImple-->"  + i);
			if(i == 66){
				try{
					Thread.sleep(2000);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}
}