class ThreadCustom implements Runnable
{
	Thread t;
	ThreadCustom()
	{
		t=new Thread(this,"A");
		t.start();
	}
	public void run()
	{
		System.out.println("Thread Running..."+Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		new ThreadCustom();
	}
}