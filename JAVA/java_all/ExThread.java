class ExThread extends Thread
{
	public void run()
	{
		System.out.println("MultiThreading : "+this.getId());
	}
	public static void main(String args[])
	{
		ExThread t1=new ExThread();
		ExThread t2=new ExThread();
		ExThread t3=new ExThread();
		t1.start();
		t2.start();
		t3.start();

		// t1.run();
		// t2.run();
		// t3.run();
	}
}
