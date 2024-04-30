class ThreadExample extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":"+"ABC....");
	}
	public static void main(String args[])
	{
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		t1.start();
		t2.start();
	}
}