class JavaException4
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[10]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of range");
			//System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}