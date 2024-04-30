class Sample2
{
	public static void main(String args[])
	{
		try
		{
			int a= 100/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array error");
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}