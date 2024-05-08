class ExThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(this.getId() + ":" + i);
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
		ExThread1 t1=new ExThread1();
		ExThread1 t2=new ExThread1();
		ExThread1 t3=new ExThread1();
		t1.start();
		t2.start();
		t3.start();
	}
}
