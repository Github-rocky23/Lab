class JavaException3
{
	public static void main(String args[])
	{
		try
		{
			String s="abc";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			//System.out.println("Number Format Exception raised");
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}