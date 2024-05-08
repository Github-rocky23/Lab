class ThreadName implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public static void main(String args[])
	{
		ThreadName t1=new ThreadName();
		ThreadName t2=new ThreadName();
		ThreadName t3=new ThreadName();
		
		Thread th1=new Thread(t1,"A");
		Thread th2=new Thread(t2,"B");	
		Thread th3=new Thread(t3,"C");
		th1.start();
		th2.start();
		th3.start();
	}
}
