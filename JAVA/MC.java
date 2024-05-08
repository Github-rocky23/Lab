class UDException extends Exception
{
	UDException(String s)
	{
		super(s);
	}
}
class MC
{
	public static void main(String args[])
	{
		try
		{
			throw  new UDException("UD Exception");
		}
		catch (UDException e)
		{
			System.out.println(e.getMessage());
		}
	}
}