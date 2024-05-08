class Counter
{
	int count=0;
	void incre()
	{
		count++;
	}
	void display()
	{
		System.out.println(count);
	}
}
class Count
{
	public static void main(String args[])
	{
		Counter c1 = new Counter(), c2 = new Counter(), c3 = new Counter();
		c1.incre();
		c1.display();
		c2.incre();
		c2.display();
		c3.incre();
		c3.display();
	}
}

	
