class ThreadJoin implements Runnable
{.02
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public static void main(String args[])
	{
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();
		ThreadJoin t3=new ThreadJoin();
		
		Thread th1=new Thread(t1,"A");
		Thread th2=new Thread(t2,"B");	
		Thread th3=new Thread(t3,"C");
		th1.start();
		try
		{
			th1.join();
		}
		catch(Exception e)
		{
		}
		th2.start();
		th3.start();
	}
}
