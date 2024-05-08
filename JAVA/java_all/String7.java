class String7
{
	public static void main(String args[])
	{
		String s="what do you know about me";
		boolean a=s.contains("do you know");
		boolean b=s.contains("about");
		boolean c=s.contains("hello");
		if (a)
		{
			System.out.println("string contains do you know");
		}
		else
			System.out.println("string does not contains do you know");
		if (b)
		{
			System.out.println("string contains about");
		}
		else
			System.out.println("string does not contains about");
		if (c)
		{
			System.out.println("string contains hello");
		}
		else
			System.out.println("string does not contains hello");
	}
}