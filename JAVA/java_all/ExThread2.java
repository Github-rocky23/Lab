class ExThread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getId() + ":" + i);
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
		ExThread2 t1=new ExThread2();
		ExThread2 t2=new ExThread2();
		ExThread2 t3=new ExThread2();
		
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);	
		Thread th3=new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
	}
}
