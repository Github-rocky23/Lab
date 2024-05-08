class Table
{
	void PrintTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
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
class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(5);
	}
}
class Thread2 extends Thread
{
	Table t;
	Thread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(6);
	}
}
class WithOutSynchronization
{
	public static void main(String args[])
	{	
		Table t=new Table();
		Thread1 th1=new Thread1(t);
		Thread2 th2=new Thread2(t);
		th1.start();
		th2.start();
	}
}


