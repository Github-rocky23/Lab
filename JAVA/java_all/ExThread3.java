class ExThread3 implements Runnable
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
		ExThread t1=new ExThread();
		ExThread t2=new ExThread();
		ExThread t3=new ExThread();
		
		Thread th1=new Thread(t1,"A");
		Thread th2=new Thread(t2,"B");	
		Thread th3=new Thread(t3,"C");
		th1.start();
		th2.start();
		th3.start();
	}
}
