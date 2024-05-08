class ExThread extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("A"))
		{	
			for( int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			
		}
		else
		{
			for(int i=5;i>=1;i--)
			{
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
	public static void main(String arg[])
	{
		ExThread th1 = new ExThread();
		ExThread th2 = new ExThread();
		Thread t1 = new Thread(th1,"A");
		Thread t2 = new Thread(th2,"B");
		t1.start();
		t2.start();
	}	
}
