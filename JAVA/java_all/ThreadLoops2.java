class ThreadLoops2 implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("A"))
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
		else
		{
			for(int i=5;i>=1;i--)
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
	}
	public static void main(String args[])
	{
		ThreadLoops2 t1=new ThreadLoops2();
		ThreadLoops2 t2=new ThreadLoops2();
		
		Thread th1=new Thread(t1,"A");
		Thread th2=new Thread(t2,"B");	
		th1.start();
		th2.start();
	}
}
