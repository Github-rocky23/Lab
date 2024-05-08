class Deadlock
{
	public static void main(String args[])
	{
		final String r1="abc";
		final String r2="xyz";
		new Thread()
		{
			public void run()
			{
				synchronized(r1)
				{
					System.out.println("Thread1 locked resourse 1");
					try
					{
						Thread.sleep(10);
					}
					catch(InterruptedException e)
					{
						System.out.println("Catch");
					}
					synchronized(r2)
					{
						System.out.println("Thread1 locked resourse 2");
					}
				}
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				synchronized(r2)
				{
					System.out.println("Thread2 locked resourse 2");
					try
					{
						Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
					}
					synchronized(r1)
					{
						System.out.println("Thread2 locked resourse 1");
					}
				}
			}
		}.start();
	}
}
		

		