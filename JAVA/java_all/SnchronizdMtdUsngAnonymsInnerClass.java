class Table
{
	synchronized void PrintTable(int n)
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
class SnchronizdMtdUsngAnonymsInnerClass
{
	public static void main(String args[])
	{	
		Table t=new Table();
		//Thread th1=new Thread()
		new Thread()
		{
			public void run()
			{
				t.PrintTable(5);
			}
		}.start();
		//Thread th2=new Thread()
		new Thread()
		{
			public void run()
			{
				t.PrintTable(6);
			}
		}.start();
	}
}


