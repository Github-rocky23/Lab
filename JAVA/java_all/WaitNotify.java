class Account
{
	int balence=10000;
	synchronized void withdraw(int amount)
	{
		if(amount>balence)
		{
			System.out.println("Going to withdraw");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
			}
		}
		balence=balence-amount;
		System.out.println("withdraw completed");
	}
	synchronized void deposit(int amount)
	{
		balence=balence+amount;
		System.out.println("Balence deposited completed");
		notify();
	}
}
class WaitNotify
{
	public static void main(String args[])
	{	
		Account a=new Account();
		//Thread th1=new Thread()
		new Thread()
		{
			public void run()
			{
				a.withdraw(15000);
			}
		}.start();
		//Thread th2=new Thread()
		new Thread()
		{
			public void run()
			{
				a.withdraw(10000);
			}
		}.start();

	}
}


