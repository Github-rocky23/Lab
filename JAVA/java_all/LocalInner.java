class Outer
{
	void display()
	{
		class Inner
		{
              		void show()
			{
				System.out.println("Local inner class");
			}
		}
		new Inner().show();
	}
}
class LocalInner
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.display();
	}
}